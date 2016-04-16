/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transferobjects.Member;

/**
 *
 * @author Johan
 */
public class MembersDaoImpl 
{
    public List<Member> getAllMembers()
    {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Member> members = null;
        try
        {
            DataSource ds = new DataSource();
            con = ds.createConnection();
            pstmt = con.prepareStatement("SELECT * FROM Members");
            rs = pstmt.executeQuery();
            members = new ArrayList<Member>();
            while (rs.next()) 
            {
                Member member = new Member();
                member.setMemberId(rs.getInt("MemberId"));
                if(rs.getInt("MemberId") == 0)
                {
                    member.setAdmin(false);
                }
                else if(rs.getInt("MemberId") == 1)
                {
                    member.setAdmin(true);
                }
                member.setAlias(rs.getString("Alias"));
                member.setFirstName(rs.getString("FirstName"));
                member.setLastName(rs.getString("LastName"));
                member.setEmail(rs.getString("Email"));
                member.setUsername(rs.getString("Username"));
                member.setPassword(rs.getString("Password"));
                member.setSalt(rs.getString("Salt"));
                members.add(member);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally{
                    try{ if(rs != null){ rs.close(); } }
                    catch(SQLException ex){System.out.println(ex.getMessage());}
                    try{ if(pstmt != null){ pstmt.close(); }}
                    catch(SQLException ex){System.out.println(ex.getMessage());}
                    try{ if(con != null){ con.close(); }}
                    catch(SQLException ex){System.out.println(ex.getMessage());}
		}
        return members;
    }
}
