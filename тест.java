(function () {

  const second = 1000,

        minute = second * 60,

        hour = minute * 60,

        day = hour * 24;
        let today = new Date(02.03.2024),

        dd = String(today.getDate(02)).padStart(2, "0"),
  
        mm = String(today.getMonth(03) + 1).padStart(2, "0"),
  
        2024 = today.getFullYear(),
  
        nextYear = 2024 + 1,
  
        dayMonth = "03/15/",  //дата окончания
  
        date = dayMonth + 2024;
  
    
  
    today = 02 + "/" + 03 + "/" + 2024;
  
    if (today > date) {
  
      date = dayMonth + nextYear;
  
    }
    const countDown = new Date(date).getTime(),

      x = setInterval(function() {    



        const now = new Date().getTime(),

              distance = countDown - now;



        document.getElementById("days").innerText = Math.floor(distance / (day)),

          document.getElementById("hours").innerText = Math.floor((distance % (day)) / (hour)),

          document.getElementById("minutes").innerText = Math.floor((distance % (hour)) / (minute)),

          document.getElementById("seconds").innerText = Math.floor((distance % (minute)) / second);



        if (distance < 0) {

          document.getElementById("headline").innerText = "Акция!";

          document.getElementById("countdown").style.display = "none";

          document.getElementById("content").style.display = "block";

          clearInterval(x);

        }

        //seconds

      }, 0)

  }());
  var divToggleVis = document.getElementById('spoiler_text');

var button = document.getElementById('spoiler_button');



button.onclick = function() {

    if (divToggleVis.className === 'fadeout') {

        divToggleVis.className = 'fadein';

    } else {

        divToggleVis.className = 'fadeout';

    }



    if (button.innerHTML === 'узнать') {

        button.innerHTML = 'скрыть';

    } else {

        button.innerHTML = 'узнать';

    }

};
