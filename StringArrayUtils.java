/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if(array.length==0)
          return "";
          
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if(array.length==0)
         return "";
         
         return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array.length==0)
         return "";
         
         return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array.length==0)
         return "";
         
         return array[array.length-2];
    
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean ret=false;
        
        for(int i=0;i<array.length;++i)
        {
           if(array[i]==value)
             ret=true;
        }
        
        return ret;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] res=new String[array.length];
        
        for(int i=array.length-1;i>=0;--i)
          res[array.length-i-1]=array[i];
          
         return res;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if(array.length==0)
         return true;
        
         int left_ptr=0;
         int right_ptr=array.length-1;
         
         while(left_ptr<right_ptr)
         {
            if(array[left_ptr]!=array[right_ptr])
              return false;
             
              left_ptr++;
              right_ptr--;
          }
          
          return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        
        int[] letter_list=new int[26];
        for(int i=0;i<26;++i)
         letter_list[i]=0;
         
         for(int i=0;i<array.length;++i)
         {
             String tmp_str=array[i];
             
             for(int j=0;j<tmp_str.length();++j)
             {
                 if(Character.isLetter(tmp_str.charAt(j)))
                 {
                     if(Character.isUpperCase(tmp_str.charAt(j)))
                     {
                         letter_list[(int)(Character.toLowerCase(tmp_str.charAt(j)))-(int)('a')]++;
                       }
                      else
                      {
                          letter_list[(int)(tmp_str.charAt(j))-(int)('a')]++;
                       }
                    
                   }
              }
              
              
          }
          boolean ret=true;
          
          for(int i=0;i<26;++i)
          {
              if(letter_list[i]==0)
               ret=false;
           }
           
           return ret;
        
         
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurence=0;
        
        for(int i=0;i<array.length;++i)
        {
          if(array[i]==value)
           occurence++;
        }
        
        return occurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int occurence=0;
        
        for(int i=0;i<array.length;++i)
        {
           if(array[i]==valueToRemove)
           {
              occurence++; 
           }
        }
        
        String[] ret=new String[array.length-occurence];
        int ptr=0;
        for(int i=0;i<array.length;++i)
        {
           if(array[i]==valueToRemove)
           {
              continue;
           }
           
           else
           {
              ret[ptr]=array[i];
              ptr++;
            }
        }
        
        return ret;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        
        String[] ret_tmp=new String[array.length];
        for(int i=0;i<ret_tmp.length;++i)
         ret_tmp[i]="";
        
        int idx=0;
        int ptr_array=0;
        int count=0;
        while(ptr_array<array.length)
        {
            String tmp_str=array[ptr_array];
            ret_tmp[idx]=tmp_str;
            idx++;
            count++;
            while(ptr_array<array.length && tmp_str==array[ptr_array])
            {
               ptr_array++;
            }
            
            
        }
        
        String[] ret=new String[count];
        int idx_ret=0;
        
        for(int i=0;i<ret_tmp.length;++i)
        {
           if(ret_tmp[i]!="")
           {
               ret[idx_ret]=ret_tmp[i];
               idx_ret++;
           }
        }
        
        return ret;
        
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
       
        String ret_str="";
        
        String[] ret_tmp=new String[array.length];
        for(int i=0;i<ret_tmp.length;++i)
         ret_tmp[i]="";
        
        int idx=0;
        int ptr_array=0;
        int count=0;
        while(ptr_array<array.length)
        {
            String tmp_str=array[ptr_array];
            
            
            String str_tmp="";
            while(ptr_array<array.length && tmp_str==array[ptr_array])
            {
               str_tmp+=array[ptr_array];
               ptr_array++;
            }
            
            ret_tmp[idx]=str_tmp;
            idx++;
            count++;
            
        }
        
        String[] ret=new String[count];
        
        for(int i=0;i<count;++i)
        {
           ret[i]=ret_tmp[i];
        }
        
        return ret;
        
    }


}
