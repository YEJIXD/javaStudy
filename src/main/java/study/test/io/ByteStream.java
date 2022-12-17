package study.test.io;

public class ByteStream {
    /*
    * Byte Stream
      · 바이트 단위로 데이터를 전송
      · 바이트 단위로 구성된 파일(동영상, 이미지, 음악 등)을 처리하기에 적합한 스트림
      · 바이트 스트림의 최상위 클래스는 InputStream 과 OutputStream
      · 자손 클래스들은 입출력에 필요한 추상 메소드를 자시넹 맞게 구현해놓았다.
       
      · FileInputStream / FileOutputStream
      · ByteArrayInputStream / ByteArrayOutputStream
      · PipedIInputStream / PipedOutputStream
      · AudioInputStream / AudioOutputStream
      
    ☁ InputStream 과 OutputStream
      · 바이트 스트림의 최상위 클래스로써 둘 다 추상 클래스
       
      · InputStream Method
         · int available()                      : 현재 읽을 수 있는 바이트 수를 반환
         · void close()                         : 스트림을 닫음
         · void mark(int readLimit)             : 스트림에서 현재 위치를 표시, reset()에 의해 돌아감
         · boolean markSupported()              : mark()와 reset() 지원 여부 확인
         · abstract int read()                  : 스트림에서 1Byte를 읽음(0~255 아스키코드 값), 더이상 읽을 데이터가 없으면 -1 반환
         · int read(byte[] b)                   : 배열 b의 크기만큼 읽어서 배열 b의 지저오딘 위치부터 저장
         · int read(byte[] b, int off, int len) : 최대 len만큼의 byte를 읽어서 배열 b의 지정된 위치부터 저장
         · void reset()                         : mark() 를 마지막으로 호출한 위치로 이동
         · long skip(long n)                    : n Byte만큼 데이터를 건너뛰고 바이트 수를 반환

    ☁ ByteArrayInputStream 과 ByteArrayOutputStream
       · 바이트 배열에 데이터를 입출력하는 스트림
       · 다른 디바이스로 입출력하기 전에 임시로 변환하여 저장하는 용도로 사용
       · 스트림의 종류가 다르더라도 사용하는 방법은 비슷
       · 입출력에 사용되는 자원이 메모리 밖에 없으므로 close()를 반드시 하지 않아도 GC가 자동으로 자원을 회수한다.

    ☁ FileInputStream 과 FileOutputStream
       · 바이트 단위로 파일을 통한 입출력 스트림
       · 생성자의 인자로 File 객체를 이용하거나 파일의 이름을 직접 String 형태로 사용
       · 파일이 없을 경우도 있으므로 예외처리를 해야 함

     · FileInputStream 생성자
         · FileInputStream(String filePath)                    : 지정된 파일 이름을 가진 실제 파일과 입력 스트림 생성
         · FileInputStream(File fileObj)                       : 지정된 파일 객체와 입력 스트림 생성
         · FileInputStream(FileDescriptor fdObj)               : 파일 디스크럽터로 입력 스트림 생성

     · FileOutputStream 생성자
         · FileOutputStream(String filePath)                   : 지정된 파일 이름을 가진 실제 파일과 출력 스트림 생성
         · FileOutputStream(String filePath, boolean append)   : 지정된 파일 이름을 가진 실제 파일과 출력 스트림 생성, 추가 모드를 설정 
         · FileOutputStream(File fileObj)                      : 지정된 파일 객체와 출력 스트림 생성
         · FileOutputStream(File fileObj, boolean append)      : 지정된 파일 객체와 출력 스트림 생성, 추가 모드를 설정
         · FileOutputStream(FileDescriptor fdObj)              : 파일 디스크럽터로 출력 스트림 생성

    * 바이트 보조 스트림
      · 종류
         · FileInputStream / FileOutputStream                  : 입출력 스트림 보조
         · BufferedInputStream / BufferedOutputStream          : 버퍼를 이용한 성능 향상
         · DataInputStream / DataOutputStream                  : 기본형 단위 데이터 처리
         · SequenceInputStream / SequenceOutputStream          : 여러 개의 스트림을 하나로 연결
         · ObjectInputStream / ObjectOutputStream              : 객체단위로 입출력 / 객체 직렬화와 관련
         · 없음 / PrintStream                                   : 버퍼를 이용하여 추가적인 print 관련 기능
         · PushBackInputStream / 없음                           : 버퍼를 이용해서 읽어 온 데이터를 다시 되돌리는 기능

      · FilterInputStream 과 FilterOutputStream
         · InputStream / OutputStream 의 자손
         · 모든 보조 스트림의 부모 클래스

      · FilterInputStream 과 FilterOutputStream 의 생성자
         · FileInputStream 생성자의 접근제어자가 protected이기 떄문에 직접 객체를 생성해 사용할 수 없고 상속을 통해 오버라이딩되어야 한다.


      · protected FilterInputStream(InputStream in)            : InputStream 의 객체를 이용해 특정 기능을 수행하는 FileInputStream 객체를 생성
      · protected FilterOutputStream(OutputStream out)         : OutputStream 의 객체를 이용해 특정 기능을 수행하는 FileOutputSream 객체를 생성

    * 입력 스트림 / 출력 스트림 : 입출력 대상
      · FileInputStream / FileOutputStream                     : 파일
      · ByteArrayInputStream / ByteArrayOutputStream           : 메모리 (byte배열)
      · PipeInputStream / PipeOutputStream                     : 프로세스(프로세스 간 통신)
      · AudioInputStream / AudioOutputStream                   : 오디오 장치

    * BufferedInputStream 과 BufferedOutputStream
      · 입출력 효율을 높이기 위해 버퍼를 사용하는 보조 스트림
      · 한 바이트씩 입출력하는 것보다 버퍼를 이용해서 한 번에 여러 바이트를 입력하는 것이 효율적이고 빠르기때문에 대부분의 입출력 작업에 이용

      * BufferedInputStream
       · 원하는 자료를 1byte 단위로 읽는 read() 메소드를 수행하면 내부적으로 버퍼를 준비하고 버퍼의 크기만큼 한꺼번에 데이터를 읽고 버퍼로부터 1byte씩 읽어 들여 프로그램으로 전달

      * BufferedOutputStream
       · 1byte씩 출력하면 시스템 버퍼에 출력을 쌓아두고 버퍼가 모두 채워지거나 flush(), close() 명령을 사용하면 버퍼의 모든 내용을 출력

      * BufferedInputStream 생성자
       · BufferedInputStream(InputStream in)                : InputStream에 대한 BufferedInputStream 객체 생성
       · BufferedInputStream(InputStream in, int size)      : InputStream에 대한 BufferedInputStream 객체 생성, 내부 버퍼의 크기를 size 값으로 설정

      * BufferedOutputStream 생성자
       · BufferedOutputStream(OutputStream out)             : OutputStream에 대한 BufferedOutputStream 객체 생성
       · BufferedOutputStream(OutputStream out, int size)   : OutputStream에 대한 BufferedOutputStream 객체 생성, 내부 버퍼의 크기를 size 값으로 설정

      * FileStream 같은  경우 1차 스트림이기 떄문에 미리 만들어져 있는 스트림 없이 자신의 객체를 생성해 입출력을 시도할 수 있지만
        BufferedStream 객체는 2차 스트림이기 때문에 미리 만들어진 스트림을 생성자의 인자로 받아 객체를 생성한다.

      * DataInputStream 과 DataOutputStream
       · 자바의 기본 자료형 데이터를 입출력하는 기능을 제공하는 스트림

      * DataInputStream 과 DataOutputStream 생성자
       · DataInputStream(InputStream in)               : InputStream 을 인자로 DataInputStream을 생성
       · DataOutputStream(OUtputStream out)            : OutpuStream 을 인자로 DataOutputStream을 생성

     * DataInputStream 메소드
       · boolean readBoolean()                         : 스트림에서 읽은 boolean을 반환
       · byte readByte()                               : 스트림에서 읽은 byte을 반환
       · char readChar()                               : 스트림에서 읽은 char을 반환
       · double readDouble()                           : 스트림에서 읽은 double을 반환
       · float readFloat()                             : 스트림에서 읽은 float을 반환
       · long readLong()                               : 스트림에서 읽은 long을 반환
       · short readShort()                             : 스트림에서 읽은 short을 반환
       · int readInt()                                 : 스트림에서 읽은 int을 반환
       · void readFully(byte[] byf)                    : 스트림에서 buf 크기만큼 바이트를 읽어 buf에 저장
       · void readFully(byte[] buf, int off, int len)  : 스트림에서 len 길이만큼 바이트를 읽어 buf의 off 위치에 저장
       · String readUTF()                              : UTF-8 형식으로 쓰여진 문자를 읽어 문자열로 반환
       · static String readUTF(DataInput in)           : 입력스트림 in 에서 UTF-8 형식으로 쓰여진 문자를 읽어 문자열로 반환
       · int skipBytes(int n)                          : 현재 읽고 있는 위치에서 n만큼 건너뜀

     * DataOutputStream 메소드
       · void flush()                                  : 버퍼를 출력하고 비움
       · int size()                                    : 스트림에 출력된 바이트 크기를 반환
       · void writeBoolean(boolean b)                  : boolean을 1byte 값으로 출력
       · void writeByte(int i)                         : int를 4바이트 값으로 상위 바이트 먼저 출력
       · void writeBytes(String s)                     : 문자열을 바이트 순으로 출력
       · void writeChar(int i)                         : char를 2바이트 값으로 상위 바이트 먼저 출력
       · void writeChars(String s)                     : String 문자열을 char형으로 출력
       · void writeDouble(Double d)                    : Double 클래스의 doubleToBits()를 사용하여 long으로 변환하여 long 값을 8바이트 수량으로 상위 바이트 먼저 출력
       · void writeFloat(float f)                      : Float 클래스의 floatToBits()를 사용해 변환하여 int 값을 4바이트 수량으로 상위 바이트 먼저 출력
       · void writeInt(int i)                          : int의 상위 바이트 먼저 출력
       · void writeLong(long l)                        : long 상위 바이트 먼저 출력
       · void writeShort(short s)                      : short 형의 인자값 출력
       · void writeUTF(String s)                       : UTF-8 형식으로 문자열 출력

     * SequenceInputStream
       · 여러 개의 입력 스트림을 연속적으로 연결해서 하나의 스트림으로 처리
       · 생성자를 제외하고 다른 입력 스트림과 기능이 동일하다
       · 큰 파일을 여러 개의 작은 파일로 나눴다가 하나의 파일로 합치는 작업 등을 할 때 유용하다

     * SequenceInputStream 생성자
       · SequenceInputStream(Enum e)                            : 열거체 e에 저장된 순서대로 입력 스트림 연결
       · SequenceInputStream(InputStream in1, InputStream in2)  : 두 개의 입력 스트림을 하나로 연결

    * */
}
