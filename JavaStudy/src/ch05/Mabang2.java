package ch05;

public class Mabang2 {
	public static void main(String[] args) {
		// 마방진 숫자를 저장할 2차원 배열 7x7 size
		int[][] mabang = new int[7][7];

		// 규칙 1
		int row = 0;
		int col = 7/2;
		mabang[row][col] = 1;

		// 2~25숫자 반복
		for (int i = 2; i <= 7*7; i++) {
			row = row - 1;// 1행 감소
			col = col - 1;// 1열 감소

			// 행이 음수가 되었을 때
			if (row < 0) {
				// 열도 음수가 되었을 때 15의 대각선 위 경우
				if (col < 0) {
					row = row + 2;
					col = col + 1;

				// 열은 정상일 떄
				} else {
					row = 7-1;
					// row=5+row
				}
				// 행이 정상일때
			} else {
				//열이 음수가 되었을 때 
				if(col<0) {
					col=7-1;
				//열이 정상일 때
				}else {
					if(mabang[row][col]>0) {
						row=row+2;
						col=col+1;
					}
				}

			}

			mabang[row][col] = i;
		} //end for
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
