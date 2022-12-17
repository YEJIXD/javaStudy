package study.test.io;

public class File {
    /*
    * File Class
      · 파일이나 디렉터리를 추상화한 클래스
      · 가장 많이 사용되는 입출력 대상

    ☁ File 클래스의 생성자와 메소드
     · 생성자
       · File(String fileName)                  : 주어진 파일 이름을 가지는 객체 생성
       · File(String pathName, String fileName) : 파일의 경로와 이름을 따로 지정하여 객체 생성
       · File(File pathName, String fileName)   : 〃
       · File(URI uri)                          : 지정된 uri로 파일 생성
       
     · 메소드
       · String getName()                       : 파일 이름을 String으로 반환
       · String getPath()                       : 파일의 경로를 String으로 반환
       · String getAbsolutePath()               : 파일의 절대 경로를 String으로 반환
       · File getAbsolutePath()                 : 파일의 절대 경로를 File로 반환
       · String getParent()                     : 파일의 조상 디렉토리를 String으로 반환
       · File getParent()                       : 파일의 조상 디렉토리를 File로 반환
       · String getCanonicalPath()              : 파일의 정규 경로를 String으로 반환
       · File getCanonicalFile()                : 파일의 정규 경로를 File로 반환
    * */
}
