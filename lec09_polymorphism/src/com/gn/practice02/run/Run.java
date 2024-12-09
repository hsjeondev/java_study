package com.gn.practice02.run;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		
		SchoolMember[] schoolMembers = new SchoolMember[3];
		
		schoolMembers[0] = new Student();
		schoolMembers[1] = new Teacher();
		schoolMembers[2] = new Staff();

		for(SchoolMember schoolMember : schoolMembers) {
			schoolMember.introduce();
			if(schoolMember instanceof Student) {
				((Student) schoolMember).study();
			}
			if(schoolMember instanceof Teacher) {
				((Teacher) schoolMember).teach();
			}
			if(schoolMember instanceof Staff) {
				((Staff) schoolMember).work();
			}
		}
		
	}

}
