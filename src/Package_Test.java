import java.util.Scanner;

public class Package_Test {

	public static void main(String[] args) {
		// 기본 패키지에 저장된 클래스
		//    클래스명은 반드시 첫자는 영문 대문자로 지정
		//   - 동일한 패키지 내에서 동일한 이름의 클래스는 올수 없다.
		Scanner sc= new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("MBTI 검사를 시작하겠습니다.");
		System.out.println("본인에게 맞는 것을 숫자를 입력해주세요.");
		System.out.println("==========================");
		System.out.println("발표를 해야합니다. 하게 된다면?");
		System.out.println("1. 사람들 앞에 발표를 어려워하지 않는다. \t2. 사람들 앞에 발표를 어려워한다."); // 1. E 2. I
		int num1 = sc.nextInt();
		System.out.println(num1+"번을 입력했습니다. \n다음 질문에 번호를 입력해주세요.");
		System.out.println("비행기를 탑승을 했지만 갑자기 비행기가 흔들리면?");
		System.out.println("1. 비행기가 흔들리니 무섭고 걱정되네. 멀미가 나니까 가만히 있는게 좋을거 같다. \t2. 왜 흔들리고있지?(구명조끼가 어디있더라 비행기가 추락하고 테러가 일어나는 상상 비행기가 추락하면 해야하는 행동들 복기)"); // 1. S 2. N
		int num2 = sc.nextInt();
		System.out.println(num2+"번을 입력했습니다. \n다음 질문에 번호를 입력해주세요.");
		System.out.println("친구가 나에게 와서 시험 망쳤다고 속상해 하고있습니다. 보기 중 답변은?");
		System.out.println("1. 다음에는 잘 볼꺼야 \t2. 몇점 맞았어?"); // 1. F 2. T
		int num3 = sc.nextInt();
		System.out.println(num3+"번을 입력했습니다. \n다음 질문에 번호를 입력해주세요.");
		System.out.println("하루의 일정 계획을 셍울 때");
		System.out.println("1. 오전엔 과제하고 청소 오후에는,,, \t2. x시까지 과제, xx시까지 청소, xx시까지 산책"); // 1.P 2. J
		int num4 = sc.nextInt();
		System.out.println(num4+"번을 입력했습니다. \n잠시만 기다려주세요.");
		System.out.println("본인의 이름을 넣어주세요");
		String name = sc.next();
		if (num1==1&&num2==1&&num3==1&&num4==1) {
			System.out.println(name+"님은 ESFP 입니다.");
			System.out.println("ESFP는 자유로운 영혼의 연예인 입니다.");
		}else if (num1==1&&num2==1&&num3==1&&num4==2) {
			System.out.println(name+"님은 ESFJ 입니다.");
			System.out.println("ESFJ는 사교적 외교관 입니다.");
		}else if (num1==1&&num2==1&&num3==2&&num4==1) {
			System.out.println(name+"님은 ESTP 입니다.");
			System.out.println("ESTP는 모험을 즐기는 사업가 입니다.");
		}else if (num1==1&&num2==2&&num3==1&&num4==1) {
			System.out.println(name+"님은 ENFP 입니다.");
			System.out.println("ENFP는 재기발랄한 활동가 입니다.");
		}else if (num1==2&&num2==1&&num3==1&&num4==1) {
			System.out.println(name+"님은 ISFP 입니다.");
			System.out.println("ISFP는 호기심많은 예술가 입니다.");
		}else if (num1==1&&num2==1&&num3==2&&num4==2) {
			System.out.println(name+"님은 ESTJ 입니다.");
			System.out.println("ESTJ는 엄격환 관리자 입니다.");
		}else if (num1==1&&num2==2&&num3==1&&num4==2) {
			System.out.println(name+"님은 ENFJ 입니다.");
			System.out.println("ENFJ는 정의로운 사회운동가 입니다.");
		}else if (num1==2&&num2==1&&num3==1&&num4==2) {
			System.out.println(name+"님은 ISFJ 입니다.");
			System.out.println("ISFJ는 용감한 수호자 입니다.");
		}else if (num1==1&&num2==2&&num3==2&&num4==2) {
			System.out.println(name+"님은 ENTJ 입니다.");
			System.out.println("ENTJ는 대담한 통솔자 입니다.");
		}else if (num1==2&&num2==1&&num3==2&&num4==2) {
			System.out.println(name+"님은 ISTJ 입니다.");
			System.out.println("ISTJ는 청렴결백한 논리주의자 입니다.");
		}else if (num1==2&&num2==2&&num3==2&&num4==2) {
			System.out.println(name+"님은 INTJ 입니다.");
			System.out.println("INTJ는 용의주도한 전략가 입니다.");
		}else if (num1==2&&num2==2&&num3==2&&num4==1) {
			System.out.println(name+"님은 INTP 입니다.");
			System.out.println("INTP는 논리적인 사색가 입니다.");
		}else if (num1==2&&num2==2&&num3==1&&num4==1) {
			System.out.println(name+"님은 INFP 입니다.");
			System.out.println("INFP는 열정적인 중재자 입니다.");
		}else if (num1==2&&num2==2&&num3==1&&num4==2) {
			System.out.println(name+"님은 INFJ 입니다.");
			System.out.println("INFJ는 옹호자 입니다.");
		}else if (num1==2&&num2==1&&num3==2&&num4==1) {
			System.out.println(name+"님은 ISTP 입니다.");
			System.out.println("ISTP는 만능 재주꾼 입니다.");
		}else if (num1==1&&num2==2&&num3==2&&num4==1) {
			System.out.println(name+"님은 ENTP 입니다.");
			System.out.println("ENTP는 뜨거운 논쟁을 즐기는 변로가 입니다.");
		}else {
			System.out.println("1과 2의 숫자로만 입력해주세요.");
		}
	}
}
