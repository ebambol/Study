void setup() {
  Serial.begin(9600);
  pinMode(13,OUTPUT);
  digitalWrite(13,LOW);
  delay(100);
}
// 'a'를 수신 했을 때 13핀 LED를 켜고
// 'b'를 수신 했을 때 13번 LED를 끈다.
void loop() {
 if(Serial.available()){
  char c = Serial.read();
  if(c == 'a'){
    Serial.println("A");
    digitalWrite(13,HIGH); // LED 켬
    delay(100);
  }
  if(c == 'b'){
    Serial.println("B");
    digitalWrite(13,LOW); // LED 끔
    delay(100);
  }
 }
}
