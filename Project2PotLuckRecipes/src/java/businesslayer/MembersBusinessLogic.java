/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslayer;

import dataaccesslayer.MembersDaoImpl;
import transferobjects.Member;
import java.util.List;

/**
 *
 * @author Johan
 */
public class MembersBusinessLogic 
{
    private MembersDaoImpl membersDao;
    
    public MembersBusinessLogic()
    {
        membersDao = new MembersDaoImpl();
    }
    
    public List<Member> getAllMembers()
    {
        return membersDao.getAllMembers();
    }
}
