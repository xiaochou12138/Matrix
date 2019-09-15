/**
 * @author 15052
 * 通用矩阵抽象类
 */
package com.Matrix;

public abstract class GenericMatrix <E extends Number>{
/**返回两个元素相加*/
	protected abstract E add(E e1,E e2);
/**返回两个元素相乘*/
	protected abstract E multiply(E e1,E e2);
/**抽象方法，返回值*/
	protected abstract E zero();
/**	矩阵加法 */
	@SuppressWarnings("unchecked")
	public E[][] matrixAdd(E[][] m1,E[][] m2){
		//矩阵边界
		if(m1.length!=m2.length ||m1[0].length!= m2[0].length);
		throw new RuntimeException("矩阵类型不一致，无法进行加法计算");
		
		E[][] result = (E[][]) new Number[m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
			result[i][j] = add(m1[i][j], m2[i][j]);
			}
			}
			return result;
		// 相加操作
				for (int i = 0; i < result.length; i++)
					for (int j = 0; j < result[0].length; j++) {
						result[i][j] = (E) this.add(m1[i][j], m2[i][j]);
					}
				return result;

	}
	/** 矩阵乘法 */
	@SuppressWarnings("unchecked")
	public E[][] matrixMultiply(E m1[][], E m2[][]) {
		// 矩阵边界判断
		if (m1[0].length != m2.length)
			throw new RuntimeException("矩阵类型不匹配，无法进行乘法计算");
		
		
		E[][] result = (E[][])new Number[m1.length][m2[0].length];
		
		// 乘法操作 
		for (int i = 0; i < result.length; i++)
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = this.zero();
				
				for (int k = 0; k < m1[0].length; k++) {
					result[i][j] = this.add(result[i][j], this.multiply(m1[i][k], m2[k][j]));
				}
			}
		return result;
	}
	/** 打印输出 */
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
