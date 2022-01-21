

const result = [1,2,3,4];

const join = result.join();

console.log(join);

{const array = [1,2,3,4,5];

    const [ , , ...result] =array;

    console.log(result);

}

{
    class Student{
        constructor(name,age,enrolled,score){
            this.name= name;
            this.age = age;
            this.enrolled = enrolled;
            this.score = score; 
        }
    }
    const students = [
        new Student('A',29,true, 45),
        new Student('B',28,false, 80),
        new Student('C',30,true, 90),
        new Student('D',40,false, 66),
        new Student('E',18,true, 88)

    ]
   
 
    
    const newStudent = [];   
    for(let i =0; i<students.length;i++){
        
       if(students[i].enrolled == true){
           newStudent.push(students[i]);
       }
       
    }
    console.log(newStudent);
 
}