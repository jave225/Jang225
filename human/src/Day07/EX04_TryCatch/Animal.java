package Day07.EX04_TryCatch;

 class Animal {
	 
	 class  Dog extends Animal {  }
	 
	 class  Cat extends Animal {  }
	 
	 public class ClassCast {
		 
		 //  Dog,Cat --> Animal
		 // Animal = Cat 경우는 다시 Dog으로 변환 불가
		 // - Cat을  Dog으로 타입변환 할수 없다.
		 public static void ChangeDog( Animal  animal) {
			 try {
				 Dog dog =(Dog) animal;
			} 
			 catch ( ClassCastException e) {
				System.err.println("Cat을 Dog로 변환할수 없습니다. ");
			}
			
		}
		 public static void main(String[] args) {
			 Dog dog = new Dog();
			 ChangeDog(dog);
			 
			 Cat  cat = new  Cat();
			 ChangeDog(cat); // cat이 전달된 경우, (dog)으로 변환 불가 -> 예외발생
			
		}
	 }

}
