/*
    If EmpNo=123 then EmpName=Jadeja. Like this how can we keep 100 EmpName with its EmpId?
 */
package Problem11;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRecord
{
    public static void main(String[] args)
    {
        EmployeeRecord er = new EmployeeRecord();

        HashMap<Integer,String> empMap=new HashMap<>();
        empMap = er.initialEmployeeRecord();

        empMap.replace(123,"Jadeja"); //updated EmpName of EmpNo 123

        System.out.println("Initial employee record is:");
        for(Map.Entry mEntry : empMap.entrySet())
        {
            System.out.print("EmpNo: "+mEntry.getKey() + "      EmpName: ");
            System.out.println(mEntry.getValue());
        }

    }
    public HashMap initialEmployeeRecord()
    {
        HashMap<Integer,String> hMap=new HashMap<>();
        for(int i=101; i<=200; i++)
        {
            hMap.put(i,"EmpName"+i); //will insert dummy values
            // we can also take input from user or read from a file
        }
        return hMap;


    }

}
