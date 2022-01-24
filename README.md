# android_data

안드로이드 저장소의 구성 1. 내부(data) 2. 외부(sd-cord)

>FileOutputStream : java <br>
FileOutputStream openFileOutput(String name, int mode) <br>
MODE_PRIVATE : 항상 0이어야 된다.

------------------

### FileOutputStream
#### 메소드
1. write() -> 데이터를 저장
2. close() -> 데이터 스트림을 닫는다<br>

### FileInputStream
기본 사용 방법 -> `FileInputStream openFileInput(String name)` <br>
#### 메소드
1. read() -> 데이터 읽기
2. close() -> 스트림 닫기 <br>

### boolean deleteFile(Stringname)
내부 저장소의 파일을 삭제, 삭제되면 true, 실패하면 false
