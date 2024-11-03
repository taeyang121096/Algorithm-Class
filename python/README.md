
# Python 학습 - Java 개발자를 위한 고급 가이드

이 가이드는 Java 개발자가 Python을 빠르게 익히고, 나아가 고급 주제를 학습하여 Python을 심도 있게 사용할 수 있도록 구성되었습니다.

## 목차
1. [Python 설치 및 시작](#python-설치-및-시작)
2. [기본 문법](#기본-문법)
3. [고급 문법](#고급-문법)
4. [주요 Python 라이브러리 학습](#주요-python-라이브러리-학습)
5. [AI 개발을 위한 Python 학습 로드맵](#ai-개발을-위한-python-학습-로드맵)

---

## 1. Python 설치 및 시작

Python을 설치하고 시작하기 위해서는 [Python 공식 웹사이트](https://www.python.org/downloads/)에서 다운로드하세요. 설치 후 다음 명령어로 버전을 확인할 수 있습니다:

```bash
python --version
```

---

## 2. 기본 문법

### Hello, World!

Python은 Java에 비해 더 간결하게 코드를 작성할 수 있습니다.

**Java:**
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Python:**
```python
print("Hello, World!")
```

### 변수와 데이터 타입

Python은 타입을 자동으로 추론합니다.

**예제:**
```python
num = 10         # 정수형
price = 19.99    # 실수형
name = "Alice"   # 문자열
is_active = True # 불리언
```

---

## 3. 고급 문법

Python의 고급 문법에서는 함수형 프로그래밍, 데코레이터, 제너레이터, 컨텍스트 매니저, 메타클래스 등을 배울 수 있습니다.

### 1) 함수형 프로그래밍

Python에서는 `map`, `filter`, `reduce` 등을 사용해 함수형 프로그래밍 스타일을 사용할 수 있습니다.

**예제:**
```python
from functools import reduce

# 리스트의 모든 요소를 제곱
numbers = [1, 2, 3, 4]
squared = list(map(lambda x: x**2, numbers))

# 필터링 - 짝수만 선택
evens = list(filter(lambda x: x % 2 == 0, numbers))

# 모든 요소의 합 구하기
sum_all = reduce(lambda x, y: x + y, numbers)

print(squared) # [1, 4, 9, 16]
print(evens)   # [2, 4]
print(sum_all) # 10
```

### 2) 데코레이터

데코레이터는 함수를 인자로 받아서 새로운 기능을 추가하거나 수정하여 반환하는 함수입니다. 함수의 행동을 꾸미거나 수정할 때 유용합니다.

**예제:**
```python
def greeting_decorator(func):
    def wrapper(name):
        print("Hello, ", end="")
        func(name)
    return wrapper

@greeting_decorator
def say_name(name):
    print(name)

say_name("Alice") # Hello, Alice
```

### 3) 제너레이터

제너레이터는 `yield` 키워드를 사용하여 일시적으로 값을 반환하고, 필요한 경우 다시 호출할 수 있습니다.

**예제:**
```python
def fibonacci(n):
    a, b = 0, 1
    while a < n:
        yield a
        a, b = b, a + b

for num in fibonacci(10):
    print(num) # 0, 1, 1, 2, 3, 5, 8
```

### 4) 컨텍스트 매니저

`with` 문을 사용하여 파일 등을 열고 닫는 과정을 자동으로 처리할 수 있습니다.

**예제:**
```python
with open('example.txt', 'w') as file:
    file.write("Hello, World!")
# 파일은 자동으로 닫힘
```

### 5) 메타클래스

메타클래스는 클래스를 생성하는 클래스입니다. 주로 클래스 생성 시점에 특정 처리를 하고 싶을 때 사용합니다.

**예제:**
```python
class MyMeta(type):
    def __new__(cls, name, bases, dct):
        print(f"Creating class {name}")
        return super().__new__(cls, name, bases, dct)

class MyClass(metaclass=MyMeta):
    pass
# "Creating class MyClass" 출력
```

---

## 4. 주요 Python 라이브러리 학습

Python에는 다양한 라이브러리가 있습니다. 여기서는 데이터 과학 및 AI 분야에서 많이 사용되는 주요 라이브러리를 다룹니다.

### NumPy

NumPy는 다차원 배열을 쉽게 다루기 위해 사용됩니다.

**예제:**
```python
import numpy as np

# 배열 생성
arr = np.array([1, 2, 3, 4])
print(arr * 2) # 배열 내 모든 요소를 2배로
```

### Pandas

Pandas는 데이터 분석을 위한 라이브러리로, 데이터 프레임 구조를 제공합니다.

**예제:**
```python
import pandas as pd

# 데이터 프레임 생성
data = {'Name': ['Alice', 'Bob'], 'Age': [25, 30]}
df = pd.DataFrame(data)
print(df)
```

### Matplotlib

Matplotlib는 데이터 시각화를 위한 라이브러리입니다.

**예제:**
```python
import matplotlib.pyplot as plt

x = [1, 2, 3, 4]
y = [10, 20, 25, 30]

plt.plot(x, y)
plt.show()
```

### Scikit-Learn

Scikit-Learn은 머신러닝을 위한 라이브러리입니다.

**예제:**
```python
from sklearn.linear_model import LinearRegression

# 모델 생성 및 학습
model = LinearRegression()
model.fit([[1], [2], [3]], [2, 4, 6])

# 예측
print(model.predict([[4]])) # [[8]]
```

### TensorFlow/PyTorch

딥러닝 라이브러리로, 신경망을 쉽게 구축하고 학습시킬 수 있습니다.

---

## 5. AI 개발을 위한 Python 학습 로드맵

1. **Python 기본 문법**: 변수, 제어문, 함수 등 학습
2. **데이터 분석**: NumPy, Pandas, 시각화 라이브러리 학습
3. **기계 학습**: Scikit-Learn을 통해 지도/비지도 학습 개념 이해
4. **딥러닝**: TensorFlow 또는 PyTorch로 신경망 학습
5. **프로젝트**: 실제 데이터를 사용한 모델링, Kaggle 도전

---

Python은 간결하고 강력한 문법을 제공하며, 다양한 라이브러리로 인해 데이터 분석 및 AI 개발에 최적화된 언어입니다. Java 개발자로서 Python을 학습하면 프로토타입 제작이 빠르며 데이터 분석과 AI 개발에 큰 도움이 됩니다.
