package Jan_4;

	class parent
	{
		void show(){
			System.out.println("This is Parent");
		}}

	class child extends parent{
		@Override
		void show() {
			super.show();
			System.out.println("This is Child");
		}
	}
	public class TC004_AtOverride {

		public static void main(String[] args) {
			
			child obj2= new child();
			obj2.show();
		}
	}

