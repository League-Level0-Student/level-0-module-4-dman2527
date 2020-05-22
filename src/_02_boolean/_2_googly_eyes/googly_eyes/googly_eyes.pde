PImage face;
void setup() {
  
  face= loadImage("face.jpeg");
  size(800,600);
  face.resize(width,height);
}

void draw() {
  background(face);
  if (mouseX > 295){
   mouseX = 295; 
  }
  if (mouseX < 250){
   mouseX = 250; 
  }
  if (mouseY > 180){
   mouseY=180;
  }
  if (mouseY < 140){
   mouseY=140; 
  }
  fill(#FFFFFF);
  ellipse(270,160,75,75);
  fill(#050505);
  ellipse(mouseX,mouseY,25,25);
  fill(#FFFFFF);
  ellipse(520,155,75,75);
  fill(#050505);
  ellipse(mouseX+250,mouseY-4,25,25);
}
