package study.test.io;

public class CharStream {
    /*
    * CharStream
     · 문자 단위로 데이터 전송
     · 바이트 스트림과 사용 방법은 거의 동일
     · 영어 이외의 문자에 대한 처리와 인코딩을 내부에서 처리
     · 문자 스트림의 최상위 클래스는 Reader 와 Writer

    * 문자 스트림과 바이트 스트림의 비교
     · InputStream -> Reader, OutputStream -> Writer 에 대응
     · 이름만 조금 다를 뿐, 활용 방법을 거의 같다.

    * 스트림 비교
     · 바이트 스트림 | 문자 스트림
       · FileInputStream              | FileReader
         FileOutputStream             | FileWriter
       · ByteArrayInputStream         | CharArrayReader
         ByteArrayOutputStream        | CharArrayWriter
       · PipedInputStream             | PipedReader
         PipedOutputStream            | PipedWriter
       · StringBufferedInputStream    | StringReader
         StringBufferedOutputStream   | StringWriter
       ⭐ StringBufferedInputStream 과 StringBufferedOutputStream 은 JDK 1.1부터 사용되지 않음
         
    * InputStream 과 Reader 메소드 비교
       · abstract int read()                 | int read()
       · int read(byte[] b)                  | int read(char[] cbuf)
       · int rad(byte[] b, int off, int len) | abstract int read(char[] cbuf, int off, int len)

    * OutputStream 과 Writer 메소드 비교
       · abstract void write(int b) | void write(int c)
       · void write(byte[] b) | void write(char[] cbuf)
       · void write(byte[] b, int off, int len) | abstract void write(char[] cbuf, int off, int len)
       · - | void write(String str)
       · - | void write(String str, int off, int len)

    * 보조 스트림 비교
     · 바이트 보조 스트림 | 문자 스트림
       · BufferedInputStream  | BufferedReader
         BufferedInputStream  | BufferedWriter
       · FilterInputStream  | FilterReader
         FilterInputStream  | FilterWriter
       · LineNumberInputStream  | LineNumberReader
       · PrintStream  | PrintWriter
       · PushbackInputStream  | PushbackReader

    * Reader 와 Writer
    * */
}
