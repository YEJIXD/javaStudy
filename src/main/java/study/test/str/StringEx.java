package study.test.str;

import java.util.Locale;

public class StringEx {
    /*
     · Stirng Class
     · 문자열을 사용하는데 가장 많이 사용하는 클래스
     · String 객체가 생성되면 그 값이 길어지거나 줄어들 수 없으며, 구성 문자들 중 어떤 것도 바꿀 수 없다.
     · 즉 우리가 String 객체의 값을 바꾼다면, 본래 객체 외의 새로운 객체를 생성하여 그 참조 주소를 가리키는 변수가 된다는 것
     
      · charAt(int index)                       (return : char)     - index 위치에 있는 문자(char) 반환
      · compareTo(String str)                   (return : int)      - str보다 사전순으로 앞이면 음수, 같으면 0, 뒤면 정수값을 반환
      · concat(String str)                      (return : String)   - 기존 문자열에 str을 이어 새로운 String을 반환 
      · equals(String str)                      (return : boolean)  - str과 같은 문자열이면(대소문자 구분) True, 그렇지 않으면 False 반환
      · equalsIgnoreCase(String str)            (return : boolean)  - str과 같은 문자열이면(대소문자 구분 X) True, 그렇지 않으면 False 반환
      · length()                                (return : int)      - 문자 길이를 반환
      · replace(char oldChar, char newChar)     (return : String)   - 문자열의 oldChar를 모두 newChar로 변경
      · substring(int offset, int endIndex)     (return : String)   - offset위치에서부터 endIndex-1까지에 걸친 문자열을 반환
      · toLowerCase()                           (return : String)   - 모든 대문자를 소문자로 변환 
      · toUpperCase()                           (return : String)   - 모든 소문자를 대문자로 변환
    * */
    public void testString(){
        String str = "Hello Java";                                  // 공백도 하나의 문자로 취급
        String concat, upperCase, replace, subString;

        System.out.println("기본 String : " + str);
        System.out.println("기본 String 길이 : " + str.length());     // 문자열 길이 출력

        concat = str.concat(", Hi Java");                       // 문자열 연결
        upperCase = concat.toUpperCase();                           // 문자열 대문자로 변환
        replace = upperCase.replace("J", "L");     // 문자 J를 L로 변환
        subString = replace.substring(3, 10);                       // 3~9번째 위치의 문자열 잘라내기

        System.out.println("concat : " + concat);
        System.out.println("upperCase : " + upperCase);
        System.out.println("replace : " + replace);
        System.out.println("subString : " + subString);
    }
}
