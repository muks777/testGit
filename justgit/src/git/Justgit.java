package git;

public class Justgit {
	public static void main(String[] args) {
		System.out.println("hello");
	}

	@Override
	public String toString() {
		String str = "메소드생성";
		return str;
	}

	/*
		1단계. git 홈페이지에서 레포지토리 생성 및 이클립스 연동
		
		1) git에서 레포지토리 생성.
		2) 이클립스에서 clone 레포지토리 => 레포지토리 http주소 및 토큰 입력(토큰 별도 발급 필요)
		
		2단계. 작성한 프로젝트 => 레포지토리로 이동 및 커밋,푸시
		
		1) 우클릭=> team => share => repository 선택 후 finish
		2) 우클릭=> team => add to index 누르면 "?" => * 로 바뀐다.
		3) 우클릭=> team => commit(ctrl+#)
		4) 커밋만 하면 (Commit Message 작성해야 커밋 가능) github에 올라가지 않는다. (push 까지 해줘야 한다.)
	 */


}