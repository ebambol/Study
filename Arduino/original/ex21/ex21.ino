void setup() {
  Serial.begin(9600);
  randomSeed(analogRead(0)); // 중복없는 난수값 발생
  pinMode(2,INPUT);
}
void loop() {
  int result = digitalRead(2); //버튼눌린경우 HIGH 아니면 LOW
 if(result == HIGH){
   int randNumber = random(0,256); // 0에서 부터 255까지
   Serial.println(randNumber);
   analogWrite(11,randNumber);
 }
 delay(200); //0.2초 딜레이
}
