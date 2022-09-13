package Lab1808;

import java.util.*;
import java.util.Map.Entry;

public class LabActivity3
{
    HashMap<String,String> M1 = new HashMap<String,String>();
    //  METHOD TO ADD ELEMENTS
    HashMap<String,String> saveCountryCapital(String CountryName,String Capital)
    {
        M1 = new HashMap<String,String>();
        M1.put(CountryName,Capital);
        System.out.println(M1);
        return M1;
    }

    //METHOD TO GET CAPITAL
    String receiveCapital(String CountryName)
    {
        System.out.println(M1.get(CountryName));
        return M1.get(CountryName);
    }

    //METHOD TO GET COUNTRY NAME
    String receiveCountry(String capitalname)
    {
        Set<Entry<String,String>> set;
        set = M1.entrySet();
        Iterator<Entry<String,String>> it;
        it = set.iterator();

        while (it.hasNext())
        {
            Entry<String,String> mw = it.next();
            if (mw.getValue().equals(capitalname))
            {
                System.out.println(mw.getKey());
                return mw.getKey();
            }
        }
        return null;
    }
