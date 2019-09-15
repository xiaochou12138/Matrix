/**
 * @author 15052
 * ͨ�þ��������
 */
package com.Matrix;

public abstract class GenericMatrix <E extends Number>{
/**��������Ԫ�����*/
	protected abstract E add(E e1,E e2);
/**��������Ԫ�����*/
	protected abstract E multiply(E e1,E e2);
/**���󷽷�������ֵ*/
	protected abstract E zero();
/**	����ӷ� */
	@SuppressWarnings("unchecked")
	public E[][] matrixAdd(E[][] m1,E[][] m2){
		//����߽�
		if(m1.length!=m2.length ||m1[0].length!= m2[0].length);
		throw new RuntimeException("�������Ͳ�һ�£��޷����мӷ�����");
		
		E[][] result = (E[][]) new Number[m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
			result[i][j] = add(m1[i][j], m2[i][j]);
			}
			}
			return result;
		// ��Ӳ���
				for (int i = 0; i < result.length; i++)
					for (int j = 0; j < result[0].length; j++) {
						result[i][j] = (E) this.add(m1[i][j], m2[i][j]);
					}
				return result;

	}
	/** ����˷� */
	@SuppressWarnings("unchecked")
	public E[][] matrixMultiply(E m1[][], E m2[][]) {
		// ����߽��ж�
		if (m1[0].length != m2.length)
			throw new RuntimeException("�������Ͳ�ƥ�䣬�޷����г˷�����");
		
		
		E[][] result = (E[][])new Number[m1.length][m2[0].length];
		
		// �˷����� 
		for (int i = 0; i < result.length; i++)
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = this.zero();
				
				for (int k = 0; k < m1[0].length; k++) {
					result[i][j] = this.add(result[i][j], this.multiply(m1[i][k], m2[k][j]));
				}
			}
		return result;
	}
	/** ��ӡ��� */
	public void printResult(Number m1[][], Number m2[][], Number m3[][], char op) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++)
				System.out.print(" " + m1[i][j]);
			
			if (i == m1.length / 2)
				System.out.print(" " + op + " ");
			else
				System.out.print("   ");
			
			for (int j = 0; j < m2[0].length; j++)
				System.out.print(" " + m2[i][j]);
			
			if (i == m1.length / 2)
				System.out.print(" " + "=" + " ");
			else
				System.out.print("   ");
			
			for (int j = 0; j < m3.length; j++)
				System.out.print(m3[i][j] + " ");
			
			System.out.println ();
		}
	}

}
