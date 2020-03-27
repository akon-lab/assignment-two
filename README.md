# Smeraldo
Smeraldo consider 4 pages(1 general & 3 sub-tree)
***
<ul> General Page
  <li>Header</li>
  <li>Navbar</li>
  <li>Intro</li>
  <li>Some info</li>
  <li>Bonus option</li>
  <li>Lil ver of sub-pages</li>
  <li>Footer</li>
  <li>Dialog Form</li>
</ul>
<ul>Sub-page
  <li>Header</li>
  <li>Navbar</li>
  <li>Intro</li>
  <li>Some info</li> 
  <li>Footer</li>
  <li>Dialog Form</li>
</ul>

1)There is header for every web-pages in smeraldo 
---
with 'burger' button to navbar and Shop name in center of header, for all pages.
***
HTML code:
```html
<header class="position-fixed header" >
  <div class="row">
          
  <div class="open" onclick="openNav()">&#9776;</div>//nav-burger
  <h1>Smeraldo</h1>//Logo-shop-name
          
  </div>
 </header> 
```
There is JS code, which change header color when it replace from top, I mean my header has fixed position so when user scroll down it just change color.
***
I made it cause it is WOW effect (LOL) and body bgcolor is white, and i think that in scrolling down will be hidden in body color
```js
<!--js to chanhe bg-color and color by replacement from the top of the site-->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script>
      
$(function(){
    $(window).on("scroll",function(){
        if($(window).scrollTop()>50){
            $(".header").addClass("change");
        }
        else{
            $(".header").removeClass("change");
        }
    })
});
    </script>
```
2)Navbar html code;
---
Which consider Links to general page and 3 sub-pages, for all pages.
***
HTML code
```html
<nav id="Navka">
    <a href="#" class="close" onclick="closeNav()">&times;</a>
    <div>
    <a href="#">Smeraldo</a>//general page
    <a href="tropic.html">Tropical Plants</a> //page with tropical plants
    <a href="pampas.html">Dried flowers</a>   //page with dried plants
    <a href="decor.html">Decoration</a>
    <a href="#contact" onclick="closeNav()">Contact Us</a>
    </div>
  </nav>
```
3)There is introduction part to web page
---
-General page: which show as big card("intro") with img background and little card("cardforintro") inside.
***
HTML code (General page):
```html
  <div class="intro">
          <div class="cardforintro">
              <h1>Smeraldo</h1>
              <p>made wih love</p>
          </div>
      </div>
```
4)Contaiiner with some information about why thad made web-page is made for
---
It contain title, image and some text;
***
HTML code (General page):
```html
  <div class="aboutus container">

        <h3>About Us</h3>
        
        <div class="aboutussecret">
            <img src="https://data.whicdn.com/images/303029427/superthumb.png?t=1512935383" alt="">
   
            <p >
              We are proud to offer beautiful flowers that are
               always hand-arranged and hand-delivered by local
                florists: that's the Teleflora Difference! Plus 
                we make it easy to send flowers online. You can 
                order your floral arrangements online from your 
                desktop, tablet, or phone. If you need to get a 
                gift last-minute, we have same-day flower delivery 
                available on most flower arrangements
            </p>
        </div>

      </div>
```
5)There is Special option in general web-page which have role as hook for users
---
It works as simple Gallery from bootstrap, but there 1item=3cards;
***
each card(".mycard") look as juct images but in hoovering text of card will come up
***
HTML code
```html
      <div class="menu mb-5">
          
        <h1 class="text-center">Special Bouqet</h1>
        <h4 class="text-center">with meaning</h4>

        <div id="carouselExampleInterval" class="carousel slide" data-ride="carousel">

            <div class="carousel-inner">

              <div class="carousel-item active" data-interval="10000">
                <div class="row justify-content-center">

                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/334763128/superthumb.jpg?t=1567335427" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta"> 
                                  <h3>Alstroemeria </h3>
                                  <p>
                                    flower is symbolic of wealth, prosperity and fortune
                                  </p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/336247992/superthumb.jpg?t=1570920989" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta"> 
                                  <h3>Carnation </h3>
                                  <p>symbolizes pride and beauty</p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/328367554/superthumb.jpg?t=1553537734" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta">
                                  <h3>	Gladiolus </h3>
                                  <p>symbolizes strength of character, faithfulness and honor</p>
                                </div>
                            </div>
                    </div>
                </div>
              </div>

              <div class="carousel-item" data-interval="2000">
                <div class="row justify-content-center">

                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/322459924/superthumb.jpg?t=1542442408" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta"> 
                                  <h3>	Hyacinth</h3>
                                  <p> symbolizes playfulness and a sporty attitude and in its extreme rashness</p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/331717433/superthumb.jpg?t=1560888317" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta"> 
                                  <h3>	Larkspur </h3>
                                  <p>symbolizes levity or lightness</p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/332401590/superthumb.jpg?t=1562395097" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta">
                                  <h3>Lily</h3>
                                  <p> symbolizes purity and refined beauty</p>
                                </div>
                            </div>
                    </div>
                </div>
              </div>

              <div class="carousel-item">
                <div class="row justify-content-center">

                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/320029653/superthumb.jpg?t=1538108120" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta">
                                  <h3>	Hydrangea </h3>
                                  <p>symbolizes heartfelt emotions</p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/333630454/superthumb.jpg?t=1564848254" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta">
                                  <h3>Gardenia </h3>
                                  <p>symbolizes purity and sweetness</p>
                                </div>
                            </div>
                    </div>
                
                    <div class="mycard">
                        <img src="https://data.whicdn.com/images/336451793/superthumb.jpg?t=1571424888" alt="" class="imghid">
                            <div class="mycardtext">
                                <div class="texta">
                                  <h3>Freesia </h3>
                                  <p>symbolizes innocence and thoughtfulness</p>
                                </div>
                            </div>
                    </div>
                </div>
              </div>

            </div>


            <a class="carousel-control-prev" href="#carouselExampleInterval" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleInterval" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>

      </div>
```
6)There little ver. of Smeraldo's sub-pages, as: Tropical plant(.ty1),Driyed flowers(.ty2) and Decoration(.ty3)
---
Each of that option has cards(.t1flower), with image,name,text,price and feedback button(.like)
***
If user wiil look website from smartphone, it wil be to much scrolling so for that, i made radio-button, which on click open his button.
I mean there are 3 options, each option have 1 radio-button, so there is 3 button with the name of option,which onlock cards to user
***
HTML code
```html
 <!--homeplant-->
      <!--switch button-->
      <fieldset>
        <legend class="text-center"><h1>Home Plants</h1></legend>
        <div class="spisok justify-content-center">
          <button id="type1" onclick="hmplant(this.id)">Tropical</button>
          <button id="type2" onclick="hmplant(this.id)">Pampas Grass</button>
          <button id="type3" onclick="hmplant(this.id)">Decoration</button>
        </div>
      </fieldset>
<!--tropical option with card and link-->
      <div id="t1" class="ty1">
        <h2> <a href="tropic.html" type="button">Tropical plants</a> </h2>

        <div class="t1flower">
          <img src="http://cdn.home-designing.com/wp-content/uploads/2017/01/tropical-plants-Monstera-deliciosa-600x600.jpg" alt="">
         
          <div class="info">
            <h3>Monstera</h3>
            <p>
            The scientific name Monstera deliciosa 
            refers, in part, to the edible pineapple-like 
            fruit this rainforest plant can provide. These stunning large-leafed plants 
            make a great statement piece and add warm, 
            tropical appeal to any interior.
           </p>
           <div class="container">
            <h5> 23,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>
          
        </div>

        <div class="t1flower">
          <img src="http://cdn.home-designing.com/wp-content/uploads/2017/01/indoor-plant-with-vines-Epipremnum-aureum-600x600.jpg" alt="">
          
          <div class="info">
            <h3>Bird of Paradise</h3>
            <p>
              Birds of paradise thrive when in bright 
              and direct light or bright and indirect 
              light, and can handle weekly waterings 
              when its soil has dried.
           </p>
           <div class="container">
            <h5> 13,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>

        </div>

        <div class="t1flower">
          <img src="http://cdn.home-designing.com/wp-content/uploads/2017/01/indoor-plants-Xerosicyos-danguyi-600x600.jpg" alt="">
          
          <div class="info">
            <h3>Pilea</h3>
            <p>
              Keep a pilea pot in bright and indirect 
              light for best results, but if that isn’t 
              available, then it can also do well in
               bright-to-medium indirect light. 
           </p>
           <div class="container">
            <h5> 10,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>

        </div>
        
      </div>
<!--dried flower option with card and link-->
      <div id="t2" class="ty2">
        <h2> <a href="pampas.html" type="button">Dried Flowers</a> </h2>
        
        <div class="t1flower">
          <img src="https://i.pinimg.com/564x/84/cc/67/84cc675d84e25e667ff0449e14f74fbd.jpg" alt="">
         
          <div class="info">
            <h3>Coton</h3>
            <p>
              Cotton is a natural fibre that grows 
              on a plant. It is both a food and 
              fibre crop, and the plant is a leafy, 
              green shrub related to the hibiscus 
              species of plants.
           </p>
           <div class="container">
            <h5> 4,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>
          
        </div>

        <div class="t1flower">
          <img src="https://i.pinimg.com/564x/9e/a5/0b/9ea50bfb39013b18d5d3623d5082bef0.jpg" alt="">
          
          <div class="info">
            <h3>Reeds</h3>
            <p>
              Reeds are many polyphyletic species, 
              which have all adapted to this wet 
              habitat by convergent evolution.
           </p>
           <div class="container">
            <h5> 3,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>

        </div>

        <div class="t1flower">
          <img src="https://i.pinimg.com/564x/be/98/7b/be987bb3ed9f8df2c647e03678ec797d.jpg" alt="">
          
          <div class="info">
            <h3>Pampas grass</h3>
            <p>
              Pampas grass is a perennial plant and can 
              reach 4 metres (13 feet) in height. The 
              long sharped-edged leaves fold at the midrib 
              and form a dense tussock (tufted bunch). 
           </p>
           <div class="container">
            <h5> 5,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div> 
        </div>  
      </div>
<!--decoration option with card and link-->
      <div id="t3" class="ty3">
        <h2> <a href="decor.html" type="button">Decoration</a></h2>
       
        <div class="t1flower">
          <img src="https://i.pinimg.com/564x/80/4a/1e/804a1e35b3bdb650cec9c29c95aa0e59.jpg" alt="">
         
          <div class="info">
            <h3>White flowers</h3>
            <p>
              Perfect addition to almost every 
              room in the home. They can brighten 
              a dull living room, add extra freshness 
              to the bathroom and even bring elegance to the bedroom.
           </p>
           <div class="container">
            <h5> 12,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>
          
        </div>

        <div class="t1flower">
          <img src="https://i.pinimg.com/236x/ba/84/66/ba8466e1ae39166c35c0922ae4e5eda3.jpg" alt="">
          
          <div class="info">
            <h3>Mixed flower</h3>
            <p>
              Many choose to do a combination of 
              some type. If 
              you’re working on flower wall art 
              or a permanent decorative piece, 
              faux flowers will work best. 
           </p>
           <div class="container">
            <h5> 10,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>
        </div>
        <div class="t1flower">
          <img src="https://i.pinimg.com/564x/82/bb/92/82bb92556800a2fcff1399da74ed1fbb.jpg" alt="">
          <div class="info">
            <h3>White Pions</h3>
            <p>
             That flowers bring warmth and life 
             to any space. Often, they help a 
             room to smell better and can add 
             a touch of sophistication.
           </p>
           <div class="container">
            <h5> 9,99$ </h5>
            <a type="button" class="like" onclick="like()">
              &hearts; 
          </a>
        </div>
          </div>
        </div>    
      </div>
```
7)Footer, same for each pages as nav or headder
---
Contain data about shop (contact.social and placement)
***
There are 3 column which made as list, I use ul tag and inside li tags replace link, for more comfortable.
***
(P.S. image also is a link to google map)
***
        HTML code:
```html
 <!--footer-->
      <footer id="contact">
        <h1>Smeraldo 
            <span type="button" id="email">&#9993;</span>
        </h1>
        <div class="content row ">
            <div class="col">
                <div>
                    <p>Contact</p>
                </div>
                <div>
                    <ul>
                    <li> 
                      <a href="#">
                        87172645717
                      </a> 
                    </li>
                    <li> 
                      <a href="#">
                        smrld@bk.en
                      </a> 
                    </li>
                    <li>
                      <a href="https://wa.me/87172645717">
                        whatsapp
                      </a> 
                    </li>
                    <li>
                      <a href="https://t.me/astanaituniversity">
                        telegram
                      </a>  
                    </li>
                </ul>
                </div>
                
            </div>
            <div class="col">
                <div>
                    <p>Social</p>
                </div>
                
                <div>
                    <ul>
                    <li>
                      <a href="https://www.instagram.com/astana_it_university/">
                        insta
                      </a>
                    </li>
                    <li>
                      <a href="https://www.facebook.com/Astana-It-University-372074696727662/?ref=py_c">
                        facebook
                      </a>
                    </li>
                    <li>
                      <a href="https://twitter.com/TokayevKZ?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor">
                        twitter
                      </a>
                    </li>
                </ul>
                </div>
                
            </div>
            <div class="col">
                <div>
                     <p>Placement</p>
                </div>
                <div>
                     <ul>
                    <li >
                        <a href="https://www.google.ru/maps/place/Astana+IT+University/@51.0908525,71.4161342,17z/data=!4m6!3m5!1s0x424585a605525605:0x4dff4a1973f7567e!4b1!8m2!3d51.0908492!4d71.4183229">
                            <img src="https://data.whicdn.com/images/341257118/original.jpg" alt="" >
                        </a>
                    </li>
                </ul>
                </div>
               
               
            </div>
        </div>
    </footer>
```
8)Dialog form.
---
Made for saving user contact if he/she has reason to chose option.
***
It is such kind of Bonus contact between shop and user, I think the full form with contact which user can send, needing in backend.
***
HTML code:
```html
  <!--dialog form which help to leave user contact to stay in touch with flower shop-->
  <div  id="dform" class="dmodal">
    <div class="dialog">

        <div class="con">

        <h3>Leave your contact</h3>
        <p>to stay in touch</p>
        <form >

        <label >
            <input type="text" placeholder="Full name">
        </label>
        <label >
            <input type="number" placeholder="Number">
        </label>
         
        </form>
        <button class="closeme">Send</button>
        </div>

    </div>
</div>
```
There is JS code for come up animation, if user click on mail button in footer
```js
<!--js dialog form -->
<script>

var modal = document.getElementById("dform");
var btn = document.getElementById("email");
var span = document.getElementsByClassName("closeme")[0];

btn.onclick = function() {
  modal.style.display = "block";
}

span.onclick = function() {
  modal.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
</script>
```
