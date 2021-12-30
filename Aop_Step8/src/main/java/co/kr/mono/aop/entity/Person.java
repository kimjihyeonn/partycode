package co.kr.mono.aop.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import co.kr.mono.aop.ui.Printer;


@Component
public class Person {
	String name;
	String major;
	List<ExamScore> examList;
	private Printer printer;
	
	public Person() {
		
	}

	public Person(String name, String major, ArrayList<ExamScore> examList, Printer printer) {
		super();
		this.name = name;
		this.major = major;
		this.examList = examList;
		this.printer = printer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List<ExamScore> getExamList() {
		return examList;
	}

	public void setExamList(List<ExamScore> examList) {
		this.examList = examList;
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", major=" + major + ", examList=" + examList + ", printer=" + printer + "]";
	}
	
	public void print() {
		String str ="Person [name=" + name + ", major=" + major + ", examList=" + examList + "]";
	
		printer.print(str);
	}
	
	public void printThrowException() {
		System.out.println("=>핵심코드 실행중");
		throw new IllegalArgumentException("=>고의로 발생시켰음.");
	}
	public Map<String, Float> getTot(){
		List<ExamScore> exams = this.getExamList();
		Map<String, Float> gradeAvg = new HashMap<String, Float>();
		for(ExamScore exam : exams) {
			Float avg = (float)(exam.getKor() + exam.getEng() + exam.getMat())/3;
			gradeAvg.put(exam.getGrade(),avg);
		}
		System.out.println("===>get Tot 내부진행 :"+gradeAvg);
		return gradeAvg;
			
		}
	public Map<String, Float> getTot(String grade){
		List<ExamScore> exams = this.getExamList();
		Map<String, Float> gradeAvg = new HashMap<String, Float>();
		for(ExamScore exam : exams) {
			if(exam.getGrade().equals(grade)) {
			Float avg = (float)(exam.getKor() + exam.getEng() + exam.getMat())/3;
			gradeAvg.put(exam.getGrade(),avg);
			}
		}
		System.out.println("===>get Tot 내부진행 :"+gradeAvg);
		return gradeAvg;
	}

}
