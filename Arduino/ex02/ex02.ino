void setup() {
  pinMode(13, OUTPUT);  //디지털 13번 핀을 디지털 신호로 출력
 
  digitalWrite(13, HIGH); //5V
  delay(5000);
  digitalWrite(13, LOW);  //0V
  delay(1000);

}

void loop() {
  digitalWrite(13, HIGH); //5V
  delay(50);            //3초
  digitalWrite(13, LOW);  //0V
  delay(50);            //3초

}
