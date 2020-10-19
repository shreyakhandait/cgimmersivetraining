package student.com;


	 class CurrentAccount extends Student{
		String device;
		CurrentAccount(int id, String name, String device){
			super(id,name);
			this.device=device;
			System.out.println("After initialization in Electronics ");
		}
		public String getDevice() {
			return device;
		}
		public void setDevice(String device) {
			this.device = device;
		}
	}


