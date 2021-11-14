# 南开 100 题 - C 语言版

## 001 成绩存入数组

【题目】m 个人的成绩存放在 score 数组中，请编写函数 fun, 它的功能是：将低于平均分的人作为函数值返回，将低于平均分的分数放在 below 所指定的函数中。

【代码】

```c
#include <stdio.h>

int fun(double score[], int m, double below[]){
	int i, k = 0;
	double aver = 0.0;
	for (i = 0; i < m; i++){
		aver += score[i];
	}
	aver /= m;
	for (i = 0; i < m; i++){
		if (score[i] < aver){
			below[k++] = score[i];
		}
	}
	return k;
}

int main(){//main function is used to Test fun function
	double score[] = {78,65,45,68,90};
	double below[5];
	int i = fun(score, 5, below);
	printf("%d\n", i);
	return 0;
}
```

## 002 被 7 或者 11 整除的数

【题目】请编写函数 fun，它的功能是：求出 1 到 100 之内能被 7 或者 11 整除，但不能同时被 7 和 11 整除的所有整数，并将他们放在 a 所指的数组中，通过 n 返回这些数的个数。

【代码】

```c
#include <stdio.h>

void fun(int a[], int *n){
	int i, j = 0;
	for (i = 2; i < 100; i++){
		if ((i % 7 ==0 || i % 11 == 0) && i % 77 != 0){
			a[j++] = i;
		}
	}
	*n = j;
}

int main(){//main function is used to Test fun function
	int n = 0;
	int a[1000];
	fun(a, &n);
	printf("%d\n",n);
	return 0;
}
```

## 003 求出能整除 x 且不是偶数的整数

【题目】请编写函数 void fun(int x, int pp[], int *n), 它的功能是：求出能整除 x 且不是偶数的各整数，并按从小到大的顺序放在 pp 所指的数组中，这些除数的个数通过形参 n 返回。

【代码】

```c
#include <stdio.h>

void fun(int x, int pp[], int *n){
	int i, j = 0;
	for (i = 1; i < x; i++){
		if (x % i == 0 && i %2 != 0){
			pp[j++] = i;
		}
		*n = j;
	}
}

int main(){//main function is used to Test fun function
	int n = 0;
	int pp[1000];
	fun(6, pp, &n);
	printf("%d\n",n);
	return 0;
}
```

## 004 统计字母出现的次数

【题目】请编写一个函数 void fun(char *tt, int pp[]), 统计在 tt 字符中" a "到" z " 26 各字母各自出现的次数，并依次放在 pp 所指的数组中。

【代码】

```c
#include <stdio.h>
#include <string.h>

void fun(char *tt, int pp[]){
	int i, j = 0;
	for (i = 0; i < strlen(tt); i++){
		if (tt[i] >= 'a' && tt[i] <= 'z'){
			j = tt[i] - 'a' ;
			pp[j] = pp[j] + 1;
		}
	}
}

int main(){//main function is used to Test fun function
	char tt[] = {'a','b','a'}; 
	int i;
	int pp[26];
	//int pp[26] = {0};
	for (i = 0; i < 26; i++){
		pp[i] = 0;
	} 
	fun(&tt, pp);
	
	for (i = 0; pp[i] != '\0'; i++){
		if (pp[i] > 0){
			char c = i + 'a';
			printf("%c = %d\n", c, pp[i]);
		}
	}	
	return 0;
}
```



## 005 指定素数输入数组

【题目】请编写一个函数 void fun(int m, int k, int xx[]), 该函数的功能是：将大于整数 m 且紧靠 m 的 k 个素数存入 xx 所指的数组中。

【代码】

```c
#include <stdio.h>
#include <math.h>

void fun(int m, int k, int xx[]) {
	int i, j, count = 0;
	for (i = m + 1;count < k ; i++) {
		for (j = 2; j <= sqrt(i); j++) {
			if (i % j == 0) {
				break;
			}
		}
		if (j > sqrt(i)) {
			xx[count++] = i;
		}
	}
}

int main() {
	int a[100];
	fun(3,5,a);
	int i;
	for (i = 0; i < 5; i++) {
		printf("%d ", a[i]);
	}
}
```



## 006 删除指定下标的字符

【题目】请编写一个函数void fun(char a[],char[],int n),其功能是：删除以各字符串中指定下标的字符。其中，a指向原字符串，删除后的字符串存放在b所指的数组中，n中存放指定的下标。

【代码】

```c
#include <stdio.h>
#include <string.h>

 void fun(char a[], char b[], int n) {
 	int i, j = 0;
 	for (i = 0; i < strlen(a); i++) {
 		if (i != n) {
 			b[j++] = a[i];
		 }
	 }
	 b[j] = '\0';
 }
 
 int main() {
 	char a[] = "Hello";
 	char b[10];
 	fun(a, b, 2);
 	puts(b);
    return 0;
 }
```

## 007 元素下标存放k中

【题目】请编写一个函数int fun(int *s,int t,int *k),用来求出数组的最大元素在数组中的下标并存放在k所指的储存单元中。

【代码】

```c
#include <stdio.h>
#include <string.h>

int fun(int *s, int t, int *k) {
	int i, max;
	max = s[0];
	for (i = 1; i < t; i++) {
		if (s[i] > max) {
			max = s[i];
			*k = i;
		}
	}
	return 0;
}

int main() {
	int a[4];
	int i;
	for (i = 0; i < 4; i++) {
		scanf("%d", &a[i]);
	} 
	int value = 0;
	
	fun(&a, 4, &value);
	printf("%d", value);
	return 0;
}
```



## 008 计算并输出下列多项式值

【题目】编写函数fun,功能是：根据以下公式计算s,计算结果作为函数值返回；n通过形参传入。s=1+1/(1+2)+1/(1+2+3)+.......+1/(1+2+3+4+......+n)

【代码】

```c
#include <stdio.h> 

double fun(int n) {
	int i, j, t;
	double s = 0.0;
	for (i = 1; i <= n; i++) {
		t = 0;
		for (j = 1; j <= i; j++) {
			t += j;
		}
		s += 1.0/t;
	}
	return s;
}

int main() {
	printf("%lf\n", fun(10));
	return 0;
}
```

## 009 求值

【题目】编写一个函数fun，它的功能是：根据以下公式求P的值，结果由函数值带回。m与n为两个正整数，且要求m>n。p=m!/n!(m-n)!

【代码】

```c
#include <stdio.h>

double fun(int m, int n) {
	double p, t = 1.0;
	int i;
	for (i = 1; i <= m; i++) {
		t *= i;
	}
	p = t;
	for (t = 1.0, i = 1; i <= n; i++) {
		t *= i;
	}
	p /= t;
	for (t = 1.0, i = 1; i <= m - n; i++) {
		t *= i;
	}
	p /= t;
	return p;
}

int main() {
	printf("%lf",fun(10,9)); 
	return 0;
}
```

## 010 简单迭代

【题目】编写函数fun,它的功能是：利用以下的简单迭代方法求方程cos(x)-x=0的一个实根。

迭代步骤如下：(1)取x1初值为0.0；(2)x0=x1,把x1的值赋各x0;

(3)x1=cos(x0),求出一个新的x1;

(4)若x0-x1的绝对值小于0.000001，则执行步骤(5),否则执行步骤(2);

(5)所求x1就是方程cos(x)-x=0的一个实根，作为函数值返回。

程序将输出Root=0.739085。

【代码】

```c
#include <stdio.h>
#include <math.h> 

double fun() {
	double x0, x1 = 0.0;
	do {
		x0 = x1;
		x1 = cos(x0);
	} while (fabs(x0 - x1) >= 1e-6);
	return x1;
}

int main() {
	printf("%lf", fun());
	return 0;
}
```

## 011 数组左下半三角元素中的值全部置成0

【题目】下列程序定义了N×N的二维数组，并在主函数中自动赋值。请编写函数fun(int a[][N]),该函数的功能是：使数组左下半三角元素中的值全部置成0。

【代码】

```c
#include <stdio.h>
#define N 3

int fun(int a[][N]) {
	int i, j;
	for (i = 0; i < N; i++) {
		for (j = 0; j <= i; j++) {
			a[i][j] = 0;
		}
	}
}

int main() {
	
	int a[][3] = {{1,2,3},{2,3,4},{3,4,5}};
	fun(a);
	int i, j;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	return 0;
}
```

## 012 数组周边元素的平均值返回给主函数

【题目】下列程序定义了N×N的二维数组，并在主函数中赋值。请编写函数fun,函数的功能使求出数组周边元素的平均值并作为函数值返回给主函数中的s。

【代码】

```c
#include <stdio.h>
#define N 3

double fun(int w[][N]) {
	int i, j;
	double s = 0.0;
	for (i = 0; i < N; i++) {
		s += w[0][i];
	} 
	for (i = 0; i < N; i++) {
		s += w[N - 1][i];
	} 
	for (i = 0; i < N; i++) {
		s += w[i][0];
	} 
	for (i = 0; i < N; i++) {
		s += w[i][N - 1];
	} 
	s = s - w[0][0] - w[0][N - 1] - w[N - 1][0] - w[N - 1][N - 1];
	return s/(4 * N - 4);
}  
 
int main() {
	int a[][3] = {{1,2,3},{2,3,4},{3,4,5}};
	printf("%lf", fun(a));
	return 0;
}
```

## 013 求出二维函数组每列中最小元素

【题目】请编写一个函数void fun(int tt [M] [N] ,int pp[N]),tt指向一个M行N列的二维函数组，求出二维函数组每列中最小元素，并依次放入pp所指定一维数组中。二维数组中的数已在主函数中赋予。

【代码】

```c
#include <stdio.h>
#define M 3
#define N 3

void fun(int tt[M][N], int pp[N]) {
	int i, j, min;
	for (j = 0; j < N; j++) {
		min = tt[0][j];
		for (i = 1; i < N; i++) {
			if (tt[i][j] < min) {
				min = tt[i][j];
			}
		}
		pp[j] = min;
	} 
}
 
int main() {
	int a[][3] = {{1,2,3},{2,3,4},{3,4,5}};
	int b[3];
	fun(a, b);
	int i;
	for (i = 0; i < 3; i++) {
		printf("%d ", b[i]);
	}
	return 0;
}
```

## 014 二维数组周边元素之和，作为函数值返回

【题目】请别写函数fun,函数的功能使求出二维数组周边元素之和，作为函数值返回。二维数组中的值在主函数中赋予。

【代码】

```c
#include <stdio.h>
#define N 3

int fun(int w[][N]) {
	int i, j;
	int s = 0;
	for (i = 0; i < N; i++) {
		s += w[0][i];
	} 
	for (i = 0; i < N; i++) {
		s += w[N - 1][i];
	} 
	for (i = 0; i < N; i++) {
		s += w[i][0];
	} 
	for (i = 0; i < N; i++) {
		s += w[i][N - 1];
	} 
	s = s - w[0][0] - w[0][N - 1] - w[N - 1][0] - w[N - 1][N - 1];
	return s;
}  
 
int main() {
	int a[][3] = {{1,2,3},{2,3,4},{3,4,5}};
	printf("%d", fun(a));
	return 0;
}
```

## 015 w后n－1位的数作为函数值返回

【题目】请编写一个函数unsigned fun(unsigned w),w使一个大于10的无符号整数，若w是n(n≥2)位的整数，则函数求出w后n－1位的数作为函数值返回。

【代码】

```c
#include <stdio.h>

unsigned fun(unsigned w) {
	unsigned t, s = 0, s1 = 1;
	t = w;	
	while (t > 10) {
		s = s + t % 10 * s1;
		s1 = s1 * 10;
		t = t / 10;
	}
	return s;
}

int main() {
	unsigned t = 123;
	printf("%u", fun(t));
	return 0;
}
```

## 016 值保留2位小数

【题目】请编写一个函数float fun(double h),函数的功能使对变量h中的值保留2位小数，并对第三位进行四舍五入(规定h中的值位正数)。

【代码】

```c
#include <stdio.h>

float fun(double h) {
	int t;
	float s;
	h = h * 1000;
	t = (h + 5) / 10;
	s = t / 100.0;
	return s;
}

int main() {
	printf("%.2lf\n", 123.4567);
	printf("%.2lf", fun(123.4567));
	return 0;
}
```

## 017 字符串中的内容逆置

【题目】请编写一个函数fun(char *s)，该函数的功能使把字符串中的内容逆置。

【代码】

```c
#include <stdio.h>
#include <string.h>

void fun(char *s) {
	char ch;
	int i;
	for (i = 0; i < (strlen(s) - 1) / 2; i++) {
		ch = s[i];
		s[i] = s[strlen(s) - 1 - i];
		s[strlen(s) - 1 - i] = ch;
	}
}

int main() {
	char s[100];
	gets(s);
	fun(&s);
	puts(s);
	return 0;
}
```

## 018 矩阵(3行3列)的转置

【题目】编写程序，实现矩阵(3行3列)的转置(即行列互换)。

【代码】

```c
#include <stdio.h>

void fun(int array[3][3]) {
	int i, j, temp;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < i; j++) {
			temp = array[i][j];
			array[i][j] = array[j][i];
			array[j][i] = temp;
		}
	}
}

int main() {
	int s[3][3];
	int i, j;
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			scanf("%d", &s[i][j]);
		}
	}
	fun(s);
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
			printf("%d ", s[i][j]);
		}
		printf("\n");
	}
	return 0;
}
```

## 019 从字符中删除指定的字符

【题目】编写函数fun,该函数的功能是：从字符中删除指定的字符，同一字母的大、小写按不同字符处理。

【代码】

```c
#include <stdio.h>

void fun(char s[], char c) {
	int i = 0;
	char *p;
	p = s;
	while (*p) {
		if ((*p) != c) {
			s[i++] = *p;
		} 
		p++;
	}
	s[i] = '\0';
}

int main() {
	char s[100];
	gets(s);
	puts(s);
	char c = 'a';
	fun(s, c);
	puts(s);
	return 0;
}
```

## 020 求出小于或等于lim的所有素数并放在aa数组中

【题目】编写函数int fun(int lim,int aa[MAX]),该函数的功能是求出小于或等于lim的所有素数并放在aa数组中，该函数返回所求的素数的个数。

【代码】

```c
#include <stdio.h>
#include <math.h>
#define Max 100

int fun(int lim, int aa[Max]) {
	int i, j, k = 0;
	for (i = 2; i <= lim; i++) {
		for (j = 2; j <= sqrt(i); j++) {
			if (i % j == 0) {
				break;
			}
		}
		if (j > sqrt(i)) {
			aa[k++] = i;
		}
	}
	return k;
}

int main() {
	int lim = 9;
	int aa[Max];
	int k = fun(lim, aa);
	printf("%d\n", k);
	int i; 
	for (i = 0; i < k; i++) {
		printf("%d ", aa[i]);
	}
	return 0;
}
```

## 021 字符按ASCII码降序排列

【题目】请编写函数fun,对长度为7个字符的字符串，除首尾字符外，将其余5个字符按ASCII码降序排列。

【代码】

```c
#include <stdio.h>

void fun(char *s, int num) {
	char t;
	int i, j;
	for (i = 1; i < num - 2; i++) {
		for (j = i + 1; j < num - 1; j++) {
			if (s[i] - s[j] < '0') {
				t = s[i];
				s[i] = s[j];
				s[j] = t;
			}
		}
	}
} 

int main() {
	char s[7] = "HelloCC";
	fun(&s, 7);
	int i;
	for (i = 0; i < 7; i++) {
		printf("%c ", s[i]);
	}
	return 0;
}
```

## 022 带头节点的链表结构求最高分

【题目】N名学生的成绩已在主函数中放入一个带头节点的链表结构中，h指向链表的头节点。请编写函数fun，它的功能是：找出学生的最高分，由函数值返回。

【代码】

```c
#include <stdio.h>
#include <stdlib.h>

typedef struct student {
	struct student *next;
	double score;
} Student;

double fun(Student *h) {
	double max;
	Student *q = h;
	max = h->score;
	do {
		if (q->score > max) {
			max = q->score;
		}
		q = q->next;
	} while (q);
	return max;
}

Student *Create() {
	double score;
	scanf("%lf", &score);
	Student *student;
	if (score == -1) {
		return NULL;
	} else {
		student = (Student *)malloc(sizeof(Student));
		student->score = score;
		student->next = Create();
	}
	return student;
}

int main() {
	Student *h;
	h = Create();
	double max = fun(&h);
	printf("%lf", max);
	return 0;
}
```

## 023 判断字符串是否为回文

【题目】请编写函数fun，该函数的功能是：判断字符串是否为回文?若是则函数返回1，主函数中输出YES，否则返回0，主函数中输出NO。回文是指顺读和倒读都是一样的字符串。

【代码】

```c
#include <stdio.h>

int fun(char *str) {
	int i, n = 0, flag = 1;
	char *p = str;
	while (*p) {
		n++;
		p++;
	}
	for (i = 0; i < n / 2; i++) {
		if (str[i] != str[n - 1 - i]) {
			flag = 0;
			break;
		}
	}
	return flag;
}

int main() {
	char str[100];
	gets(str);
	if (fun(&str) == 1) {
		printf("true"); 
	} else {
		printf("false");
	}
	return 0;
}
```

## 024 将一个字符串转换为一个整数

【题目】请编写一个函数fun，它的功能是：将一个字符串转换为一个整数(不得调用C语言提供的将字符串转换为整数的函数)。

【代码】

```c
#include <stdio.h>
#include <string.h>

long fun(char *p) {
	long s = 0, t;
	int i = 0, j, n = strlen(p), k, s1;
	if (p[0] == '-') {
		i++;
	}
	for (j = i; j < n; j++) {
		t = p[j] - '0';
		for (k = j; k < n - 1; k++) {
			t *= 10;
		}
		s += t;
	}
	if (p[0] == '-') {
		return -s;
	}
	return s;
}

int main() {
	char a[100];
	gets(a);
	printf("%ld", fun(&a));
	return 0;
}
```

## 025 函数返回较长的字符串

【题目】请编写一个函数fun，它的功能是：比较两个字符串的长度，(不得调用C语言提供的求字符串长度的函数)，函数返回较长的字符串。若两个字符串长度相同，则返回第一个字符串。

【代码】

```c
#include <stdio.h>

char *fun(char *s, char *t) {
	char *p, *s1 = s, *t1 = t;
	int n = 0, m = 0;
	while (*s1) {
		n++;
		s1++;
	}
	while (*t1) {
		m++;
		t1++;
	}
	if (n >= m) {
		p = s;
	} else {
		p = t;
	}
	//puts(p);
	return p;
}

int main() {
	char a[100];
	gets(a);
	char b[100];
	gets(b);
	char *c;	
	c = fun(a, b);
	puts(c);
	
	return 0;
}
```

## 026 根据公式求值

【题目】请编写一个函数fun，它的功能是：根据以下公式求X的值(要求满足精度0.0005，即某项小于0.0005时停止迭代)：

X/2=1+1/3+1×2/3×5+1×2×3/3×5×7+1×2×3×4/3×5×7×9+...+1×2×3×...×n/3×5×7×(2n+1)

程序运行后，如果输入精度0.0005，则程序输出为3.14...。

【代码】

```c
#include <stdio.h>

double fun(double eps) {
	double s = 1.0, n = 1.0, x = 0;
	while (fabs(s) >= eps) {
		x += s;
		s *= n / (2 * n + 1);
		n++;
	}
	x = x * 2;
	return x;
}

int main() {
	printf("%lf", fun(0.0005));
	return 0;
}
```

## 027 整数放在数组a中，返回数的个数

【题目】请编写一个函数fun,它的功能是：求出1到m之内(含m)能被7或11整除的所有整数放在数组a中，通过n返回这些数的个数。

【代码】

```c
#include <stdio.h>

void fun(int m, int *a, int *n) {
	int i, j = 0;
	*n = 0;
	for (i = 1; i <= m; i++) {
		if (i % 7 == 0 || i % 11 == 0) {
			a[j] = i;
			j++;
		}
	}
	*n = j;
}

int main() {
	int a[100];
	int m = 12;
	int n;
	fun(m, a, &n);
	printf("%d", n);
	return 0;
}
```



## 028 找出一维整型数组元素中最大的值和它所在的下标

【题目】请编写一个函数fun，它的功能是：找出一维整型数组元素中最大的值和它所在的下标，最大的值和它所在的下标通过形参传回。数组元素中的值已在主函数中赋予。主函数中x是数组名，n是x中的数据个数，max存放最大值，index存放最大值所在元素的下标。

【代码】

```c
#include <stdio.h>

void fun(int a[], int n, int *max, int *index) {
	int i;
	*max = a[0];
	*index = 0;
	for (i = 0; i < n; i++) {
		if (a[i] > *max) {
			*max = a[i];
			*index = i;
		}
	}	
}

int main() {
	int a[] = {1,2,5,4};
	int max, index;
	fun(a, 4, &max, &index);
	printf("a[%d] = %d", index, max);
	return 0;
}
```

## 029 字符串换字母

【题目】请编写一个函数fun，它的功能是：将ss所指字符串中所有下标为奇数位置上的字母转换为大写(若该位置上不是字母，则不转换)。

【代码】

```c
#include <stdio.h>
#include <string.h>

void fun(char *ss) {
	int i, n = strlen(ss);
	for (i = 0; i < n; i++) {
		if (i % 2 != 0) {
			if (ss[i] >= 'a' && ss[i] <= 'z') {
				ss[i] -= 32;
			}
		}
		
	}
}

int main() {
	char a[100];
	gets(a);
	fun(a);
	puts(a);
	return 0;
}
```



## 030 求二维数组中最大元素

【题目】请编写一个函数fun，它的功能是：求出一个2×M整型二维数组中最大元素的值，并将此值返回调用函数。

【代码】

```c
#include <stdio.h>
#define M 2

int fun(int a[][M]) {
	int i, j, max = a[0][0];
	for (i = 0; i < 2; i++) {
		for (j = 0; j < M; j++) {
			if (a[i][j] >max) {
				max = a[i][j];
			}
		}
	}
	return max;
}

int main() {
	int a[2][M];
	int i, j;
	for (i = 0; i < 2; i++) {
		for (j = 0; j < M; j++) {
			scanf("%d", &a[i][j]);
		}
	}
	int max = fun(a);
	printf("%d", max);
	
	return 0;
}
```



## 031 查找字符并删除

【题目】请编写函数fun，其功能是：将s所指字符串中除了下标为偶数、同时ASCII值也为偶数的字符外，其余的全都删除；串中剩余字符所形成的一个新串放在t所指的一个数组中。

【代码】

```c
#include <stdio.h>
#include <string.h> 

void fun(char *s, char t[]) {
	int i, j = 0, n = strlen(s);
	for (i = 0; i < n; i++) {
		if (i % 2 == 0 && s[i] % 2 == 0) {
			t[j++] = s[i];
		}
	}
	t[j] = '\0';
} 
//测试
int main() {
	char s[100];
	char t[100];
	gets(s);
	fun(s, t);
	puts(t);
	return 0;
}
```

## 032 查找字符并删除

【题目】请编写函数fun，其功能是：将s所指字符串中除了下标为奇数、同时ASCII值也为奇数的字符之外，其余的所有字符都删除，串中剩余字符所形成的一个新串放在t所指的一个数组中。

【代码】

```c
#include <stdio.h>
#include <string.h> 

void fun(char *s, char t[]) {
	int i, j = 0, n = strlen(s);
	for (i = 0; i < n; i++) {
		if (i % 2 != 0 && s[i] % 2 != 0) {
			t[j++] = s[i];
		}
	}
	t[j] = '\0';
} 

int main() {
	char s[100];
	char t[100];
	gets(s);
	fun(s, t);
	puts(t);
	return 0;
}
```

## 033 将字符串中的前导 * 号全部删除

【题目】假定输入的字符串中只包含字母和 * 号。请编写函数 fun()，它的功能是：将字符串中的前导 * 号全部删除，中间和后面的 * 号不删除。

【代码】

```c
#include <stdio.h>
#include <string.h> 

void fun(char *a) {
	char *p=a;
	while (*p== '*') {
		p++;
	}
	strcpy (a,p);
} 

int main() {
	char a[100];
	gets(a);
	fun(a);
	puts(a);
	return 0;
}
```



## 035 把分数最高的学生数据放在h所指的数组中

【题目】学生的记录由学号和成绩组成，N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能使：把分数最高的学生数据放在h所指的数组中，注意：分数最高的学生可能不止一个，函数返回分数最高的学生的人数。

【代码】

```c
#include <stdio.h>
#include <stdlib.h>
#define N 3

typedef struct student {
	int id;
	double score;
} Student;

int fun(Student s[], Student t[] ) {
	double max;
	int i, j = 0;
	max = s[0].score;
	for (i = 1; i < N; i++) {
		if (s[i].score > max) {
			max = s[i].score;
		}
	}
	for (i = 0; i < N; i++) {
		if (s[i].score == max) {
			t[j].score = s[i].score;
			t[j].id = s[i].id;
			j++;
		}
    }
	return j;
}

int main() {
	Student s[N];
	double score;
	int id;
	int i;
	for (i = 0; i < N; i++) {	
		scanf("%d %lf", &id, &score);
		s[i].score = score;
		s[i].id = id;
	}
	Student t[100];
	printf("%d", fun(s, t));
	return 0;
}
```



## 035 删除字符串中的所有空格

【题目】请编写一个函数，用来删除字符串中的所有空格。

【代码】

```c
#include <stdio.h>

void fun(char *str) {
	int i = 0;
	char *p = str;
	while (*p) {
		if (*p != ' ') {
			str[i++] = *p;
		}
		p++;
	}
	str[i] = '\0';
}

int main() {
	char a[100];
	gets(a);
	fun(a);
	puts(a);
	return 0;
}
```

## 036 将字符串中的前导 * 号全部移到字符串的尾部。

【题目】假定输入的字符串中只包含字母和 * 号。请编写函数fun，它的功能是：将字符串中的前导 * 号全部移到字符串的尾部。

【代码】

有点重了，就不写了...

## 037 求出该学生的平均分放在记录的ave成员中

【题目】某学生的记录由学号、8门课程成绩和平均分组成，学号和8门课程的成绩已在主函数中给出。请编写函数fun，它的功能是：求出该学生的平均分放在记录的ave成员中。请自己定义正确的形参。

【代码】

思路看 35 题

## 038 求出ss所指字符串中指定字符的个数，并返回此值。

【题目】请编写函数fun，它的功能是：求出ss所指字符串中指定字符的个数，并返回此值。

【代码】

```c
#include <stdio.h>

int fun(char *a, char c) {
	int n = 0;
	while (*a) {
		if (*a == c) {
			n++;
		}
		a++;
	}
	return n;
}

int main() {
	char a[100];
	gets(a);
	int num = fun(a, 'c');
	printf("%d", num);
	return 0;
}
```

## 039 移动一维数组中的内容

【题目】请编写函数fun，该函数的功能是：移动一维数组中的内容，若数组中由n个整数，要求把下标从0到p(p小于等于n－1)的数组元素平移到数组的最后。

【代码】

和 40 题差不多

## 040 移动字符串中内容

【题目】请编写函数fun，该函数的功能是移动字符串中内容，移动的规则如下：把第1到第m个字符，平移到字符串的最后，把第m＋1到最后的字符移到字符串的前部。

【代码】

```c
#include <stdio.h>
#include <string.h>
#define N 100

void fun(char *w, int m) {
	char b[N];
	int n = strlen(w);
	int i, j = 0;
	for (i = 0; i < m; i++) {
		b[j] = w[i];
		j++;
	}
	for (i = 0; i < n - m; i++) {
		w[i] = w[i + m];
	}
	for (j = 0; j < m; j++) {
		w[i++] = b[j];
	}
	w[i] = '\0';
}

int main() {
	char a[N];
	gets(a);
	fun(a, 3);
	puts(a);
	return 0;
}
```



41.请编写函数fun，该函数的功能是：将M行N列的二维数组中的字符数据，按列的顺序依次放到一个字符串中。

42.下列程序定义了N×N的二维数组，并在主函数中自动赋值。请编写函数fun(int

a[][N],int n),该函数的功能是：将数组右上半三角元素中的值乘以m。

43.编写一个函数，从传入的num个字符串中找出一个最长的一个字符串，并通过形参指针max传回该串地址(用****作为结束输入的标志)。

44.编写一个函数，该函数可以统计一个长度为2的字符串在另一个字符串中出现的次数。

45.假定输入的字符串中只包含字母和*号。请编写函数fun，它的功能是：只删除字符串前导和尾部的*号，串中字母之间的*号都不删除。形参n给出了字符串的长度，形参h给出了字符串中前导*号的个数，形参e给出了字符串中最后的*个数。在编写时不得使用C语言给提供得字符串函数。

46.学生得记录由学号和成绩组称个，N名大学生得数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能时：按分数的高低排列学生的记录，高分在前。

47.请编写一个函数void fun(char *ss)，其功能时：将字符串ss中所有下标为奇数位置上的字母转换为大写(若位置上不是字母，则不转换)。

48.请编写函数fun，其功能是：将两个两位数的正整数a,b合并成一个整数放在c中。合并的方式是：将a数的十位和个位依次放在c数的千位和十位上，b数的十位和个位数依次放在c数的百位和个位上。

49.请编写函数fun，其功能是：将s所指字符串中下标位偶数同时ASCII值为奇数的字符删除，s中剩余的字符形成的新串放在t所指的数组中。

50.已知学生的记录是由学号和学习成绩构成，N名学生的数据已存入a机构体数组中。请编写函数fun，该函数的功能是：找出成绩最高的学生记录，通过形参返回主函数(规定只有一个最高分)。

51.请编写函数fun，其功能是：将所有大于1小于整数m的非素数存入xx所指的数组中，非素数的个数通过k传回。

52.编写一个函数fun，它的功能是：实现两个字符串的连接(不使用库函数strcat)，即把p2所指的字符串连接到p1所指的字符串后。

53.请编写函数fun,该函数的功能是：实现B=A+A'，即把矩阵A加上A的转置，存放在矩阵B中。计算结果在main函数中输出。

54.学生的记录由学号和成绩组称个，N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能是：把低于平均分的学生数据放在b所指的数组中，低于平均分的学生人数通过形参n传回，平均分通过函数值返回。

55.请编写函数fun，该函数的功能是：将M行N列的二维数组中的数据，按行的顺序依次放到一维数组中，一维数组中数据的个数存放在形参n所指的储存单元中。

56.假定输入的字符串中只包含字母和*号。请编写函数fun，它的功能是：除了尾部的*号之外，将字母串中其他*号全部删除。形参p已指向字符串中最后的一个字母。不使用c的字符串函数。

57.学生的记录是由学号和成绩组成，N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能是：把指定分数范围内的学生数据放在b所指的数组中，分数范围内的学生人数由函数值返回。

58.编写函数藏服那，它的功能是：求n以内(不包括n)同时能被3与7整除的所有自然数之和的平方根s，并作为函数值返回。

59.请别写函数fun，该函数的功能是：将放在字符串数组中的M个字符串(每串的长度不超过N)，按顺序合并组成一个新的字符串。

60.请编写函数fun，该函数的功能是：删去一维数组中所有相同的数，使之只剩一个。数组中的数已按由小到大的顺序排列，函数返回删除后数组中数据的个数。

61.请编写函数fun，该函数的功能使：统计各年龄段的人数。N个年龄通过调用随机函数获得，并放在主函数的age数组中；要求函数把0至9岁年龄段的人数放在d[0]中，把10至19岁年龄段的人数放在d[1]中，把20至29岁的人数放在d[2]中，其余以此类推，把100岁(含100以上年龄的人数都放在d[10]中。结果在主函数中输出。

62.请编写函数fun，该函数的功能是：统一一含字符串中单词的个数，作为函数值返回。一行字符串在主函数中输入，规定所有单词由小写字母组成，单词之间由若干个空格格开，一行的开始没有空格。

63.请编写一个函数fun，它的功能是：计算并输出给定整数n的所有因子(不包括1与自身)之和。规定n的值不大于1000。

64.请编写函数fun，其功能是：将s所指字符串中ASCII值为奇数的字符删除，串中剩余字符形成一个新串放在t所指的数组中。

65.请编写函数fun，其功能是：将两位数的正整数a、b合并成一个整数放在c中。合并的方式是：将a数的十位和个位数依次放在c数的百位和个位上，b数的十位和个位数依次放在c数的十位和千位上。

66.假定输入的字符串中只包含字母和*号。请编写函数fun，它的功能是：删除字符串中所有*号。在编写函数时，不得使用C语言提供的字符串函数。

67.学生的记录时由学号和成绩组成，N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能时：函数返回指定学号的学生数据，指定的学号在主函数中输入。若没找到指定学号，在结构体变量中给学号置空串，给成绩置-1,作为函数值返回(用于字符串比较的函数时strcmp)。

68.请编写函数fun，其功能时：计算并输出下列多项式的值：

sn=1+1/1!+1/2!+1/3!+1/4!+...+1/n!

69.请编写一个函数fun，它的功能时：求Fibonacci数列中大于t的最小的一个数，结果由函数返回。其中Fibonacci数列F(n)的定义为：

F(0)=0,F(1)=1,F(n)=F(n-1)+F(n-2)

70.编写函数fun，它的功能时：计算并输出下列级数和：

S=1/1*2+1/2*3+...+1/n(n+1)

71.请编写函数fun，其功能时：将两个两位数的正整数a、b合并形成一个整数放在c中，合并的方式是：将a数的十位和个位数依次放在c数的十位和千位上，b的十位和个位整数依次放在c数的百位和个位上。

72.请编写函数fun，其功能是：将s所指字符串中下标为偶数的字符删除，串中剩余字符形成新串放在t所指数组中。

73.假定输入的字符串中只包含字母和*号，请编写函数fun，它的功能是：除了字符串前导和尾部的*号之外，将串中其他*号全部删除。形参h已指向字符串第一个字符，形参p已指向字符串中最后一个字母。在编写程序时，不得使用C语言提供的字符串函数。

74.学生的记录由学号和成绩组成N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能时：把分数最低的学生数据放在h所指的数组中，注意：分数最低的学生可能不止一个，函数返回分数最低的学生的人数。

75.请编写函数fun，该函数的功能：将M行N列的二维数组中的数据，按列的顺学依次放到一维数组中。

76.请编写函数fun，其功能时：计算并输出当x<0.97时下列多项式的值，直到｜Sn-S(n-1)｜<0.000001为止。

Sn=1+0.5x+0.5(0.5-1)/2!x(2)+...+0.5(0.5-1)(0.5-2).....(0.5-n+1)/n!x(n)

77.请编写一个函数fun，其功能是：将两个两位数的正整数ab合并形成一个整数放在c中。合并方式是：将a数的十位和个位数依次放在c数的个位和百位上，b数的十位和个位数依次放在c数的十位和千位上。

78.请编写函数fun，其功能是：将s所指字符串中ASCII值为偶数的字符删除，串中剩余字符形成一个新串放在t所指的数组中。

79.已知学生的记录由学号和学习成绩构成，N名学生的数据已存入a结构体数组中。请编写函数fun，该函数的功能是：找出成绩最低的学生记录，通过形参返回主函数(规定只有一个最低分)。

80.程序定义了N×N的二维数组，并在主函数中自动赋值。请编写函数fun,该函数的功能是：使数组左下半三角元素中的值乘以n。

81.请编写函数fun，其功能使：将两个两位正整数a b合并形成一个整数放在c中。合并的方式使：将a数的十位和个位数依次放在c数的百位和个位上，b数的十位和个位数依次放在c数的千位和十位上。

82.请编写一个函数fun，它的功能使：计算n门课程的平均分，计算结果作为函数值返回。

83.假定输入的字符串中只包含字母和*号。请编写函数fun，它的功能使：将字符串尾部的*号全部删除，前面和中间的*号不删除。

84.请编写函数fun，其功能是：将两个两位数的正整数a b合并形成一个整数放在c中，合并的方式是：将a数的十位和个位数依次放在c的个位和百位上，b数的十位和个位数依次放在c数的千位和十位上。

85.N名学生的成绩已在主函数中放入一个带头节点的链表结构中，h指向链表的头节点。请编写函数fun，它的功能是：求出平均分，由函数值返回；

86.请编写函数fun，计算并输出给定10个数的方差：

87.请编写函数fun，其功能是：将两个两位数的正整数a b合并形成一个整数放在c中。合并的方式是：将a数的十位和个位数依次放在c数的千位和十位上，b数的十位和个位数依次放在c数的个位和百位上。

88.假定输入的字符串中只包含字母和*号。请编写函数fun，它的功能是：除了字符串前导的*号之外，将串中其他*号全部删除。在编写函数亚时，不得使用C语言提供的字符串函数。

89.学生的记录是由学号和成绩组成，N名学生的数据已在主函数中放入结构体数组s中，请编写函数fun，它的功能是：把高于等于平均分的学生数据放在b所指的数组中，高于等于平均分的学生人数通过形参n传回，平均分通过函数值返回。

90.请编写函数fun，其功能是：计算并输出下列多项式值:Sn=(1-1/2)+(1/3-1/4)+...+(1/(2n-1)1/2n).

91.请编写函数fun，其功能是：将两个两位数的正整数a b合并形成一个整数放在c中。合并的方式是：将a数的十位和个位数依次放在c的十位和千位上，b数的十位和个位数依次放在c数的个位和百位上。

92.请编写函数fun，它的功能是计算：s=(ln(1)+ln(2)+ln(3)+...+ln(m))(0.5),s作为函数值返回。

93.请编写函数fun，它的功能是计算下列级数和，和值由函数值返回。

s=1+x+x(2)/2!+x(3)/3!+...x(n)/n!

94.规定输入字符串中只包含字母和*号。请编写函数fun，它的功能是：将函数字符串中的前导*号全部删除，中间和尾部的*号不删除。

## 095 

【题目】假定输入的字符串中只包含字母和 * 号。请编写函数fun，它的功能是：使字符串中尾部的 * 号不得多于n个；若多于n个，则删除多于的 * 号；若少于或等于n个，则什么也不做，字符串中间和前面的 * 号不删除。

【代码】



## 096 相邻两个元素之平均值的平方根之和

【题目】请编写函数fun，其功能使：计算并输出给定数组(长度为9)中每相邻两个元素之平均值的平方根之和

【代码】

```c
#include <stdio.h> 
#include <math.h>

double fun(double a[9]) {
	int i, j = 1;
	double s = 0.0;
	for (i = 0; i < 9; i++) {
		if (j <= 8) {
			s += sqrt((a[i] + a[i + 1]) / 2);
			j++;
		}
	}
	return s;
}

int main() {
	double a[9] = {1,1,1,1,1,1,1,1,1};
	printf("%lf\n", fun(a));
	return 0;
}
```



## 097 计算并输出下列多项式值

【题目】请编写函数fun，其功能是：计算并输出下列多项式值：s=1+1/(1+2)+1/(1+2+3)+..1/(1+2+3...+50)

【代码】

```c
#include <stdio.h> 

double fun(int n) {
	int i, j, t;
	double s = 0.0;
	for (i = 1; i <= n; i++) {
		t = 0;
		for (j = 1; j <= i; j++) {
			t += j;
		}
		s += 1.0/t;
	}
	return s;
}

int main() {
	printf("%lf\n", fun(10));
	return 0;
}
```



## 098 倒数之和

【题目】请编写函数fun，它的功能是：计算并输出n(包括n)以内能被5或9整除的所有自然数的倒数之和。

【代码】

```c
#include <stdio.h> 
#include <math.h>

double fun(int n) {
	int i;
	double s = 0.0;
	for (i = 1; i <= n; i++) {
		if (i % 5 == 0 || i % 9 == 0) {
			s += 1.0 / i;
		}
	}
	return s;
}

int main() {
	printf("%lf\n", fun(10));
	return 0;
}
```



## 099 素数的平方根之和

【题目】请编写函数fun，其功能是：计算并输出3到n之间所有素数的平方根之和。

【代码】

```c
#include <stdio.h> 
#include <math.h>

double fun(int n) {
	int i, j;
	double s = 0.0;
	for (i = 3; i <= n; i++) {
		for (j = 2; j <= sqrt(i); j++) {
			if (i % j == 0) {
				break;
			} 
		}
		if (j > sqrt(i) ) {
			s += sqrt(i);
		}
	}
	return s;
}

int main() {
	printf("%lf\n", fun(5));
	return 0;
}
```



## 100 计算并输出 s

【题目】请编写函数fun，其功能是：计算并输出s=1+(1+2^(0.5))+(1+2 ^ (0.5)+3 ^ (0.5))+...+(1+2 ^ (0.5)+3 ^ (0.5)+...+n ^ (0.5))

【代码】

```c
#include <stdio.h> 
#include <math.h>

double fun(int n) {
	int i;
	double s = 1.0, p = 1.0;
	for (i = 2; i <= n; i++) {
		p += pow(i, 0.5);
		s += p;
	}
	return s;
}

int main() {
	printf("%lf\n", fun(2));
	return 0;
}
```



