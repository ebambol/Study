void setup() {
  Serial.begin(9600);
  pinMode(13,OUTPUT);
  pinMode(6,OUTPUT);
  digitalWrite(13,LOW);
  digitalWrite(6,LOW);
  delay(100);
}
//'a'를 수신 했을 때 13핀 LED 켜고
//'b'를 수신 했을 때 13핀 LED 끄기

void loop() {
  if(Serial.available()){
    char c = Serial.read();
      if(c=='a'){
        Serial.println("A");
        digitalWrite(13,HIGH);
        delay(100);
    } 
      if(c=='c'){
        Serial.println("C");
        digitalWrite(6,HIGH);
        delay(100);
    } 
      if(c=='b'){
        Serial.println("B");
        digitalWrite(13,LOW);
        delay(100);
    } 
      if(c=='d'){
        Serial.println("D");
        digitalWrite(6,LOW);
        delay(100);
    } 
  }
}
