/*
    �ڹ� �ּ�
    
    sqldeveloper������ ������ �ּ�
    
    -------------------------------------------
    ���Ǹ���
        �����ͺ��̽� ���� �ý������� �ش� �����Ͱ� ����ִ���
        ���Ǹ� �Ѵٰ� �ؼ� ���Ǹ����̶� �Ѵ�.
        
---------------------------------------------------------------

SQL : Structured Qurey Languege�� ���� : ����ȭ�� ���� ���

        �̹� ����ȭ �Ǿ��ִ� ������ ����ؼ� �����͸� �����ϴ� ���
        ���α׷��� �Ұ����ϴٴ� ���� Ư¡�̴�.
        
    ��������)
        1. DML ����
            - Data Manipulation Language (������ ���� ���)
            => �����͸� �߰�, ����, ����, ��ȸ�ϴ� �۾��� �ϴ� ����
            
                �����͸� �����ϴ� ���
                          �ǹ�        ����
                    C   - CREATE    - INSERT
                    R   - READ      - SELECT
                    U   - UPDATE    - UPDATE
                    D   - DELETE    - DELETE
        
        2. DDL ����
            - Data Definition Language (������ ���� ���)
            => ��ü�� ����� �����ϴ� ���
            
                CREATE  - ��ü(���̺�, �����, �Լ�, �ε���, ...)�� ���� �� ����ϴ� ����
                ALTER   - ��ü�� �����ϴ� ����
                DROP    - ��ü�� �����ϴ� ����
                TRUNCATE    - ���̺��� �߶󳻴� ����
        
        3. DCL ����
            - Data Control Language (������ ���� ���)
            => �۾��� �����Ų�ٴ��� (TCL ���� : Transaction Control Language)
                ������ �شٴ���...
                
                COMMIT
                ROLLBACK
                
                GRANT
                REVOKE
                
--------------------------------------------------------------------------------
*/

-- �̰��� ����Ŭ �ּ� => ��𼭵��� ����� �� �ִ� �ּ�

select * from emp;

select * from emp e, dept d where d.deptno = e.deptno;

--------------------------------------------------------------------------------
/*
    ���̺� ������ ��ȸ�غ��� ����
    ����)
        describe    ���̺��̸�;
        desc    ���̺��̸�;
*/

/*
    ����)
        ����Ŭ�� ������ ������ �����ϴ� ���ڷ� ;�� ����Ѵ�.
        
        ���� ���Ǹ����� �ۼ��ϴµ� ;(�����ݷ�)�� ����������
        ������ ������ ���� ������ �����Ѵ�.
        
        �ϳ��� ������ ����Ǹ� �ݵ�� �����ݷ�(;)�� ��������Ѵ�.
*/

--emp ���̺��� ������ ��ȸ�غ���.
describe emp;

desc emp;

/*
	����Ŭ�� ������Ÿ��
	
		����
			NUMBER, NUMBER(����) => ���ڴ� ����ڸ���
			NUMBER(��ȿ�ڸ���, �Ҽ������ڸ���)
		����
			CHAR
			=> ���� ���ڼ� ���ڿ�������Ÿ��

				����)
					CHAR(����) => ����Ʈ����ŭ�� ���� ���
					CHAR(���� CHAR) => ���ڰ�����ŭ�� ���� ���

			VARCHAR2
			=> ���� ���ڼ� ���ڿ�������Ÿ��
				VARCHAR2(����) => ���ڼ���ŭ�� ����Ʈ��ŭ ���� ���
				VARCHAR2(���� CHAR) => ���ڰ�����ŭ�� ���ڸ� ����� �� �ִ�.

			��)
				CHAR(10)
				=> 'A' => �� ���ڸ� ����� �� 10����Ʈ�� ��� ����Ѵ�.
				VARCHAR(10)
				=> 'A' => 1����Ʈ�� ���ڸ� ���


		��¥
			Date
				����)
					Date

*/

--------------------------------------------------------------------------------
/*
    ������ ��ȸ ����
        
        SELECT
            �÷��̸���... �޸��� �����ؼ� �����Ѵ�.
        FROM
            ���̺��̸���... �޸��� �����ؼ� ����
        [WHERE
                      ]
        [GROUP BY
        
        [HAVING
                    ]]
        [ORDER BY
                    ]
        ;
*/


--�μ����� ���̺��� ������ ��ȸ�ϼ���.
SELECT
    deptno, dname, loc
FROM
    dept
;

-- 1 + 4 �� ����� ��ȸ�ϼ���.

select 1 + 4 from emp;

select '�絿��' from emp;

/*
    ���ڿ� ������ ǥ�� : ''�� ������ ǥ���Ѵ�.
    ����Ŭ������ ���ڿ� ���ڿ��� �������� �ʴ´�.
    
    ����)
        ����Ŭ���� ���̺��̸�, �÷��̸�, ������, ���ɾ�, �Լ��̸�����
        ��ҹ��ڸ� �������� �ʴ´�.
        
        ������ ���ǻ������� ������ ��ü�� �ݵ�� ��ҹ��ڸ� ����������Ѵ�.
*/

-- ���ǰ˻�
/*
    SELECT
        �÷��̸�
    FROM
        ���̺��̸�
    WHERE
        ����(������� �ݵ�� �������� �Ǿ���Ѵ�.)
    
    ����)
        �񱳿�����
        =
        > 
        <
        <=
        >=
        !=
        <>      : �ٸ���
        
        ���� ����Ŭ������ ���ÿ� �ΰ��� ���ϴ� ���� �ȵȴ�.
            ��)
                700 < SAL < 1200    =>  ( x )
                
    ����)
        ����Ŭ�� �������� ���¸� �ſ� �߿���Ѵ�.
        ��Ģ������ ���ڴ� ���ڳ����� ���� �� �ְ�
        ���ڴ� ���ڳ����� ���� �� �ִ�.
        
        ��, ��¥�� ����ó�� ���� �� �ִ�.
        �̶� ��¥ �����Ϳ� ���ڵ����͸� ���ϴ� ���� �ƴϰ�
        ���ڵ����͸� ��¥�����ͷ� ��ȯ�� �� ���ϰԵȴ�.
        
    ����)
        ����Ŭ�� ���ڵ� ũ��񱳰� �����ϴ�. (�ƽ�Ű�ڵ� ������ ���ϱ� ����)
    
    ����)
        ����Ŭ�� ���ڿ� ���ڿ��� ������ ����.
        ��� ���ڿ��������� ��ҹ��ڴ� �ݵ�� �����ؼ� ó���ؾ��Ѵ�.
        
    ����)
        ������ ���ϴ� ����� ����Ŭ�� �� ���� ����� ������
        �� ���� ���ǿ� �´����� Ȯ���� �� ������ ������ ����Ѵ�.
        
    ����)
        �������� ������ ������ �����ϴ� ���� 
        AND �Ǵ� OR �����ڸ� �̿��ؼ� �����Ѵ�.
        
        �̶� ��ȸ�ð��� ó�� ������ ���� �ɷ����� �����ϼ��� ������.
*/  

-- ����̸��� 'smith'�� ����� �޿��� ��ȸ�ϼ���.
SELECT
    sal
FROM
    emp
WHERE
    ename = 'smith'     -- ������ ��ü�� ��ҹ��ڸ� ����������Ѵ�.
;

-- ��� �� ������ MANAGER�̰� �μ���ȣ�� 10���� ����� �̸��� ��ȸ�ϼ���.
SELECT
    ename
FROM
    emp
WHERE
    job = 'MANAGER'
    AND deptno = 10
;

--------------------------------------------------------------------------------
/*
    1. ����̸��� SMITH�� ����� �̸�, ����, �Ի����� ��ȸ�ϼ���.
*/
SELECT
    ename, job, hiredate
FROM
    emp
WHERE
    ename = 'SMITH'
;

/*
    2. ������ MANAGER�� ����� �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, sal
FROM
    emp
WHERE
    job = 'MANAGER'
;

/*
    3. �޿��� 1500�� �Ѵ� ������� �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal > 1500
;
    
/*
    4. �̸��� 'S' ������ ���ڷ� �����ϴ� ����� �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, sal
FROM
    emp
WHERE
    ename >= 'S' -- 'S' < 'Sa'
;

-- �Ի����� '81/08' ������ �Ի��� �������
-- ����̸�, �Ի���, �޿��� ��ȸ�ϼ���.
SELECT
    ename, hiredate, sal
FROM
    emp
WHERE
    hiredate < '81/08/01'
;

-- �μ���ȣ�� 10�� �Ǵ� 30���� ������� ����̸�, ����, �μ���ȣ�� ��ȸ�ϼ���.
SELECT
    ename, job, deptno
FROM
    emp
WHERE
/*
    deptno = 10
    OR deptno = 30
*/
    deptno IN (10,30)
;

/*
    NOT ������
    => ���ǽ��� ����� �����ϴ� ������
    
        ����)
            WHERE
                NOT ���ǽ�
*/

-- �μ���ȣ�� 10���� �ƴ� ������� ����̸�, ����, �μ���ȣ�� ��ȸ�ϼ���.
SELECT
    ename, job, deptno
FROM
    emp
WHERE
--    NOT deptno = 10
--    deptno != 10
    deptno <> 10
;

--------------------------------------------------------------------------------
/*
    5. �޿��� 1000 ~ 3000�� ������� ����̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, sal
FROM
    emp
WHERE
    sal >= 1000
    AND sal <= 3000
;

/*
    6. ������ MANAGER �̸鼭 �޿��� 1000�̻��� �������
        ����̸�, ����, �Ի���, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, hiredate, sal
FROM
    emp
WHERE
    job = 'MANAGER'
    AND sal >= 1000
;

--------------------------------------------------------------------------------
/*
    Ư���� ���� ������
    
    1. BETWEEN ~ AND
    => �����Ͱ� Ư�� �����ȿ� �ִ����� Ȯ���ϴ� ������
        
        ����)
            �÷��̸� BETWEEN ������1 AND ������2
            => �÷��� ������ ������1�� ������2 ���̿� �ִ��� �˻��Ѵ�.
            ����)
                ���� ���� �����Ͱ� ������1�� �;��Ѵ�.
      
                ������ �� ���� between �տ� not�� �ٿ��ش�.      
    
    2. IN
    => �����Ͱ� �־��� �����͵� �� �ϳ������� �˻��ϴ� ������
    
        ����)
            �ʵ� IN(������1, ������2, ...)
   
    3. LIKE (���ڿ� �� ������)
    => ���ڿ��� ó���ϴ� ��쿡�� ����ϴ� �������
        ���ڿ��� �Ϻκ��� ���ϵ�ī�� ó���Ͽ� ���ǽ��� �����ϴ� ���
        
        ����)
            �ʵ� LIKE '���ϵ�ī��'
        �ǹ�)
            �����Ͱ� ������ ���ڿ� ���İ� ���������� �Ǵ�
        
        ����) ���ϵ�ī�� ����
            _   : �Ѱ��� �ѱ��ڸ��� ���ϵ�ī��� �����ϴ� ��
            %   : ���ڼ��� ������� ��� ���ڸ� �����ϴ� ���ϵ�ī��
            ���ڸ� ���ԵǸ� �� ��ġ�� ���ڰ� �;��Ѵ�.
            
            ��)
                'M%' - M���� �����ϴ� ��� ���ڿ�
                'M__' - M���� �����ϴ� �����ڷ� �̷���� ���ڿ�
                '%M%' - M�� ���Ե� ��� ���ڿ�
                '%M' - M���� ������ ���ڿ�
*/

/*
��)  �޿��� 1000 ~ 3000 �� ������� �̸�, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, sal
FROM
    emp
WHERE
    sal BETWEEN 1000 AND 3000
;

/*
    �μ���ȣ�� 10, 30���� ������� �̸�, ����, �μ���ȣ�� ��ȸ�ϼ���.
*/
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    deptno IN (10,30)
;
/*  �ƴ� ���
SELECT
    ename, job, deptno
FROM
    emp
WHERE
    deptno NOT IN (10,30)
;
*/

/*
    ������ MANAGER, SALESMAN�� �ƴ� ������� �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename, job, sal
FROM
    emp
WHERE
    job NOT IN ('MANAGER','SALESMAN')
;
/*
    ����) ��ȸ�Ǵ� �÷��� ��Ī�� �ο��ؼ� ��ȸ�� �� �ִ�.
    
        ����) 
            �÷��̸� ��Ī
            �÷��̸� AS ��Ī
            �÷��̸� "��Ī"
            �÷��̸� AS "��Ī"
            
            ����) ������ ���Ե� ��Ī�� ���� ū����ǥ�� �����ش�.
*/
--------------------------------------------------------------------------------
/*
    LIKE
*/

/*
    �̸��� �ټ������� ������� �̸�, ������ ��ȸ�ϼ���.
*/
SELECT
    ename, job
FROM
    emp
WHERE
    ename LIKE '_____'
;

/*
    �Ի����� 1���� ������� �̸�, �Ի����� ��ȸ�ϼ���.
*/
SELECT
    ename, hiredate
FROM
    emp
WHERE
    hiredate LIKE '__/01/__'
;


--==============================================================================
/*
    ����1) �μ���ȣ�� 10���� ������� �̸�, ����, �Ի���, �μ���ȣ�� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, hiredate �Ի���, deptno �μ���ȣ
FROM
    emp
WHERE
    deptno = 10
;


/*
    ����2) ������ 'SALESMAN'�� ������� �̸�, ����, �޿��� ��ȸ�ϼ���.
            ��, �ʵ��̸��� ������ �̸����� ��ȸ�ǰ� �ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    job = 'SALESMAN'
;


/*
    ����3) �޿��� 1000���� ���� ������� �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    sal < 1000
;


/*
    ����4) ����̸��� 'M' ������ ���ڷ� �����ϴ� �������
            �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    ename < 'M'
;


/*
    ����5) 1981�� 9�� 8�� �Ի��� ����� �̸�, ����, �Ի����� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, hiredate �Ի���
FROM
    emp
WHERE
    hiredate = '81/09/08'
;


/*
    ����6) ����̸��� 'M' ���� ���ڷ� �����ϴ� ��� ��
            �޿��� 1000 �̻��� ����� �̸�, �޿�, ������ ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, sal �޿�, job ����
FROM
    emp
WHERE
    sal >= 1000
    AND ename > 'M'
;


/*
    ����7) ������ 'MANAGER'�̰� �޿��� 1000���� ũ�� �μ���ȣ�� 10���� �����
            �̸�, ����, �޿�, �μ���ȣ�� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�, deptno �μ���ȣ
FROM
    emp
WHERE
    job = 'MANAGER'
    AND deptno =10
    AND sal > 1000
;
    
    
/*
    ����8) ������ 'MANAGER'�� ����� ������ �������
            �̸�, ����, �Ի����� ��ȸ�ϼ���.
            ��, NOT �����ڸ� ����ϼ���.
*/
SELECT
    ename �̸�, job ����, hiredate �Ի���
FROM
    emp
WHERE
    job <> 'MANAGER'
;


/*
    ����9) ����̸��� 'C'�� �����ϴ� �ͺ��� ũ��
            'M'���� �����ϴ� �ͺ��� ���� ����� �̸�, ����, �޿��� ��ȸ�ϼ���.
            ��, BETWEEN �����ڸ� ����ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    ename BETWEEN 'C' AND 'M'
;


/*
    ����10) �޿��� 800, 950�� �ƴ� ������� �̸�, ����, �޿��� ��ȸ�ϼ���.
            ��, IN �����ڸ� ����ؼ� ó���ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    sal NOT IN (800, 950)
;


/*
    ����11) ����̸��� S�� �����ϰ� �ټ������� �������
            �̸�, ����, �޿��� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, sal �޿�
FROM
    emp
WHERE
    ename LIKE 'S____'
;


/*
    ����12) �Ի����� 3���� ������� �̸�, ����, �Ի����� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����, hiredate �Ի���
FROM
    emp
WHERE
    hiredate LIKE '__/__/03'
;


/*
    ����13) ����̸��� ���ڼ��� �ױ����̰ų� �ټ������� �������
            �̸�, ������ ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, job ����
FROM
    emp
WHERE
    ename LIKE '____'
    OR ename LIKE '_____'
;


/*
    ����14) �Ի�⵵�� 81�⵵�̰ų� 82�⵵�� �������
            �̸�, �޿�, �Ի����� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, sal �޿�, hiredate �Ի���
FROM
    emp
WHERE
    hiredate LIKE '81/__/__'
    OR hiredate LIKE '82/__/__'
;


/*
    ����15) ����̸��� S�� ������ ����� �̸�, �޿�, Ŀ�̼��� ��ȸ�ϼ���.
*/
SELECT
    ename �̸�, sal �޿�, comm Ŀ�̼�
FROM
    emp
WHERE
    ename LIKE '%S'
;




SELECT
    ename �̸�, sal ���޿�, sal + 1000 "���ʽ� ���� �޿�",
    sal * 1.5 �λ�޿�, sal* 12 ����
FROM
    emp
;


SELECT
    e.ename ����̸�, e.sal ����޿�, e.mgr ����ȣ, s.ename ����̸�, s.sal ���޿�
FROM
    emp e, emp s
WHERE
    e.mgr = s.empno(+)
;


SELECT
    ename �̸�, sal �޿�, grade �޿����
FROM
    emp, salgrade
WHERE
    sal between losal and hisal
;


SELECT
    distinct deptno �μ���ȣ
FROM
    emp
;