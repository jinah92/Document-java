# Primitive Data Type



## 기본형 타입

---

- 가장 기본이 되는 데이터 타입
- 정수형, 실수형, 문자형, 불린형

### 종류

- 논리형 (boolean, 1바이트) : True 또는 False
- 문자형 (char, 2바이트) : 작은따옴표, 한 글자
- 정수형 (int, 4바이트 / long, 8바이트)
- 실수형 (float, 4바이트 / double, 8바이트)

### 리터털

- 소스 코드의 고정된 값, 일정의 값

### 사용방법

```java
		boolean isFun = true;	//boolean
		System.out.println(isFun);
		
		char c = 'c';	// '로 감싸기, 문자 하나
		int x = 50;		// 정수형 타입 (50: 리터럴)
		long longData = 10101010L; //반드시 끝에 L(또는 l)을 입력
		float f = 32.1F;	// float 타입, 반드시 끝에 F(또는 f)을 입력
		double big = 303003030.1;
```