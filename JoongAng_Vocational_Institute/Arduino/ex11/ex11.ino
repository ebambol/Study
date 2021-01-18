//2021-01-04 이현국
void setup() {
  Serial.begin(9600);
}

void loop() {
  for (int i=0;i<156;i++){
    Serial.print("i = ");
    Serial.println(i);
    analogWrite(11,i);
    analogWrite(12,i);
    analogWrite(13,i);
    delay(25);
  }
  for(int i=156; i>=0; i--){
    analogWrite(11,i);
    analogWrite(12,i);
    analogWrite(13,i);
    delay(25);
  }
}
  
