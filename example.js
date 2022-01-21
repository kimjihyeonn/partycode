// document.write('환영합니다');

// let tall = 180;
// let weight = 74;
// let avgWeight = (tall-100)*0.9;

// document.write(avgWeight);

// let price1 =3000;
// let price2 = 6000;
// let price3 = 0;

// let result = price1+price2+price3 >10000 ? price1+price2+price3-10000+'원 초과' : '돈관리 잘했어요!';

// document.write(result);

// let val1 = parseInt(prompt("1분기 판매량"));
// let val2 = parseInt(prompt("2분기 판매량"));
// let val3 = parseInt(prompt("3분기 판매량"));
// let val4 = parseInt(prompt("4분기 판매량"));

// let avg123 = (val1+val2+val3)/3
// alert(avg123);
// let result2 = val4 >=avg123 ?  '판매량이 평균이상입니다.' :'판매량이 평균 미달입니다.'; 

// alert(result2);

// let i=1;
// let dan = prompt("단을입력하세요")
// while(i<=9){
//     document.write('${dan}X${i}=${i*dan},"<br/>')
//     i++
// }


// let num =1;
// let t = "<table border=1>";
// for(let i=1; i<=5; i++){
//     t+="<tr>";
//     for(let k=1; k<=5;k++){
//         t+="<td>"+num+"</td>"
//         num++
//     }
//     t+="</tr>"
// }
// t+="</table>";

// document.write(t);  

// window.open("http://www.naver.com","gimzi","width=350,height=400, left=50, top=10, scrollbars=yes");
// $(document).ready(function(){ 
//     $("#txt").css("color","red");
// $("#txt").css("color","blue");
// });


// $(function(){
// var obj = [{
//     "area":"서울"
// },{"area":"부산"},{"area":"전주"}]

// $(obj).each(function(i,o){
//     console.log(i+":",o);
// })

// var arr = $.grep(obj,function(a,b){
//     if(a.area=="서울"){
//         return true;
//     }
//     else{return false;}
// });
// console.log(arr);
// document.write(arr);



// })

const script= document.createElement('script')
script.src= 'https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js'
document.body.appendChild(script)

document.body.innerHTML += '<button id="btn">클릭</button>'
document.getElementById('btn').addEventListener('click', function (e) {
  $.ajax({
    method: 'GET',
    url: 'https://api.github.com/users?since=1000',
    success: function (data) {
      var target = data[2]
      $.ajax({
        method: 'GET',
        url: 'https://api.github.com/user/' + target.id,
        success: function (data) {
          var _id = 'img' + data.id
          document.body.innerHTML += '<img id="' + _id + '" src="' + data.avatar_url + '"/>'
          document.getElementById(_id).addEventListener('click', function (e) {
            this.remove()
          })
        },
        error: function (err) {
          console.error(err)
        }
      })
    },
    error: function (err) {
      console.error(err)
    }
  })
})


