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
내부 저장소의 파일을 삭제, 삭제되면 true, 실패하면 false <br>


## 실행 결과
![a](https://user-images.githubusercontent.com/65533618/150717004-fc4e7194-176a-4ebf-a5db-ed568cd3b73c.PNG) <br>
글을 적은 뒤, 저장하기를 누르고 나가기를 누른다 <br>
![bb](https://user-images.githubusercontent.com/65533618/150717015-ca525d85-5bcb-4db5-848f-b0ad89b54b11.PNG)
![c](https://user-images.githubusercontent.com/65533618/150717019-d374049a-5ba4-4b02-b2dd-d337b607e087.PNG) <br>
읽어오기를 누르면 위 상태처럼 보이게 된다.

