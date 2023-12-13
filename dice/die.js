function dice()
            {
                var player1=Math.floor(Math.random()*6)+1;
                var player2=Math.floor(Math.random()*6)+1;

                document.getElementById("player1").src="diceimg "+player1+".png";
                document.getElementById("player2").src="diceimg "+player2+".png";
            
                var resultElement= document.getElementById("result");
                if(player1 < player2)
                {
                    resultElement.innerText="player 2 wins!" ;
                    resultElement.style.color= "#ff0000";  
                }
                else if(player1 > player2)
                {
                    resultElement.innerText="player 1 wins!" ;
                    resultElement.style.color= "#ff0000";  
                }
                else
                {
                    resultElement.innerText="Its a tie!" ;
                    resultElement.style.color= "#ff0000"; 
                    //resultElement.style.textAlign="center" 
                }
            }
        