/*
 * 5개의 LED를 2개의 버튼으로 켜고,끌수 있도록 프로그램 작성
 * 힌트1: sled 전역변수를 LED가 켜져있는지 꺼져있는지 상태를 체크
 * 힌트2: sled 전역변수를 몇번째 LED가 켜져있는지 상태를 체크
 */
int sled = 0;
int led1 = 0;
int led2 = 0;
int led3 = 0;
int led4 = 0;
int led5 = 0;
void setup()
{
  Serial.begin(9600);
  pinMode(13, OUTPUT); // LED 연결 (디지털 신호 출력)
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(2, INPUT);     // 버튼 연결 (디지털 신호 입력)
  pinMode(3, INPUT);     // 버튼 연결 (디지털 신호 입력)
  digitalWrite(13, LOW); // LED 끄기
  digitalWrite(12, LOW);
  digitalWrite(11, LOW);
  digitalWrite(9, LOW);
  digitalWrite(8, LOW);
  delay(100);
}
void loop()
{
  delay(250);
  int value2 = digitalRead(2); // 0:LOW, 1:HIGH
  int value3 = digitalRead(3); // 0:LOW, 1:HIGH
  if (value2 == HIGH)
  {                  // 2번핀에 연결된 버튼을 눌렀을 때
    sled = sled + 1; // 0->1->2->3->4->5->0->...
    if (sled > 5)
    {
      sled = 1;
    }
    if (sled == 1)
    {
      if (led1 == 1)
      {
        digitalWrite(13, LOW);
        delay(100);
        digitalWrite(13, HIGH);
      }
      else
      {
        digitalWrite(13, HIGH);
        delay(100);
        digitalWrite(13, LOW);
      }
    }
    if (sled == 2)
    {
      if (led2 == 1)
      {
        digitalWrite(12, LOW);
        delay(100);
        digitalWrite(12, HIGH);
      }
      else
      {
        digitalWrite(12, HIGH);
        delay(100);
        digitalWrite(12, LOW);
      }
    }
    if (sled == 3)
    {
      if (led3 == 1)
      {
        digitalWrite(11, LOW);
        delay(100);
        digitalWrite(11, HIGH);
      }
      else
      {
        digitalWrite(11, HIGH);
        delay(100);
        digitalWrite(11, LOW);
      }
    }
    if (sled == 4)
    {
      if (led4 == 1)
      {
        digitalWrite(9, LOW);
        delay(100);
        digitalWrite(9, HIGH);
      }
      else
      {
        digitalWrite(9, HIGH);
        delay(100);
        digitalWrite(9, LOW);
      }
    }
    if (sled == 5)
    {
      if (led5 == 1)
      {
        digitalWrite(8, LOW);
        delay(100);
        digitalWrite(8, HIGH);
      }
      else
      {
        digitalWrite(8, HIGH);
        delay(100);
        digitalWrite(8, LOW);
      }
    }
  }

  if (value3 == HIGH)
  {
    if (sled == 1)
    {
      led1++;
      if (led1 > 1)
      {
        led1 = 0;
      }
      if (led1 == 1)
      {
        digitalWrite(13, HIGH);
      }
      else
      {
        digitalWrite(13, LOW);
      }
    }
    if (sled == 2)
    {
      led2++;
      if (led2 > 1)
      {
        led2 = 0;
      }
      if (led2 == 1)
      {
        digitalWrite(12, HIGH);
      }
      else
      {
        digitalWrite(12, LOW);
      }
    }
    if (sled == 3)
    {
      led3++;
      if (led3 > 1)
      {
        led3 = 0;
      }
      if (led3 == 1)
      {
        digitalWrite(11, HIGH);
      }
      else
      {
        digitalWrite(11, LOW);
      }
    }
    if (sled == 4)
    {
      led4++;
      if (led4 > 1)
      {
        led4 = 0;
      }
      if (led4 == 1)
      {
        digitalWrite(9, HIGH);
      }
      else
      {
        digitalWrite(9, LOW);
      }
    }
    if (sled == 5)
    {
      led5++;
      if (led5 > 1)
      {
        led5 = 0;
      }
      if (led5 == 1)
      {
        digitalWrite(8, HIGH);
      }
      else
      {
        digitalWrite(8, LOW);
      }
    }
  }

  Serial.print("value2: ");
  Serial.print(value2);
  Serial.print(" , ");
  Serial.print("value3: ");
  Serial.print(value3);
  Serial.print(" , ");
  Serial.print("sled : ");
  Serial.print(sled); // 아두이노 -> 컴퓨터
  Serial.print(" , ");
  Serial.print("led1 : ");
  Serial.print(led1);
  Serial.print(" , ");
  Serial.print("led2 : ");
  Serial.println(led2);
  //  if(sled == 0) { // sled  값 0 , 5개의 Led 모두 꺼진 상태
  //    digitalWrite(13, LOW);
  //    digitalWrite(12, LOW);
  //    digitalWrite(11, LOW);
  //    digitalWrite(9, LOW);
  //    digitalWrite(8, LOW);
  // }
  //  if(sled == 1) { // sled  값 1 , 첫번째  LED 켜진 상태(나머지는 꺼진 상태)
  //    digitalWrite(13, HIGH);
  //    digitalWrite(12, LOW);
  //    digitalWrite(11, LOW);
  //    digitalWrite(9, LOW);
  //    digitalWrite(8, LOW);
  //  }
  //  if(sled == 2) { // sled  값 2 , 두번째  LED 켜진 상태(나머지는 꺼진 상태)
  //    digitalWrite(13, LOW);
  //    digitalWrite(12, HIGH);
  //    digitalWrite(11, LOW);
  //    digitalWrite(9, LOW);
  //    digitalWrite(8, LOW);
  //  }
  //  if(sled == 3) { // sled  값 3 , 세번째  LED 켜진 상태(나머지는 꺼진 상태)
  //    digitalWrite(13, LOW);
  //    digitalWrite(12, LOW);
  //    digitalWrite(11, HIGH);
  //    digitalWrite(9, LOW);
  //    digitalWrite(8, LOW);
  //  }
  //  if(sled == 4) { // sled  값 4 , 네번째  LED 켜진 상태(나머지는 꺼진 상태)
  //    digitalWrite(13, LOW);
  //    digitalWrite(12, LOW);
  //    digitalWrite(11, LOW);
  //    digitalWrite(9, HIGH);
  //    digitalWrite(8, LOW);
  //  }
  //  if(sled == 5) { // sled  값 5 , 다섯번째  LED 켜진 상태(나머지는 꺼진 상태)
  //    digitalWrite(13, LOW);
  //    digitalWrite(12, LOW);
  //    digitalWrite(11, LOW);
  //    digitalWrite(9, LOW);
  //    digitalWrite(8, HIGH);
  //  }
}
