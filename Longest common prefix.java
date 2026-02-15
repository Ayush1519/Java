
class Solution {//class declared
 public:
  string longestCommonPrefix(vector<string>& strs) {//function declared
    if (strs.empty())//used if control statement to check if strs is empty
      return "";//returns empty string

    for (int i = 0; i < strs[0].length(); i++){//using for loop
        for (int j = 1; j < strs.size(); j++){//using for loop
        if (i == strs[j].length() || strs[j][i] != strs[0][i])//conditional
          return strs[0].substr(0, i);//using return keyword

      }
    }    
    return strs[0];//returns string
  }
};
