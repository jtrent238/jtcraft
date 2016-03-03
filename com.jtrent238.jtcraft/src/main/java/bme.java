/*    */ import java.util.Comparator;
/*    */ 
/*    */ public class bme
/*    */   implements Comparator
/*    */ {
/*    */   private float a;
/*    */   private float b;
/*    */   private float c;
/*    */   private int[] d;
/*    */   
/*    */   public bme(int[] paramArrayOfInt, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 13 */     this.d = paramArrayOfInt;
/* 14 */     this.a = paramFloat1;
/* 15 */     this.b = paramFloat2;
/* 16 */     this.c = paramFloat3;
/*    */   }
/*    */   
/*    */   public int a(Integer paramInteger1, Integer paramInteger2)
/*    */   {
/* 21 */     float f1 = Float.intBitsToFloat(this.d[paramInteger1.intValue()]) - this.a;
/* 22 */     float f2 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 1)]) - this.b;
/* 23 */     float f3 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 2)]) - this.c;
/* 24 */     float f4 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 8)]) - this.a;
/* 25 */     float f5 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 9)]) - this.b;
/* 26 */     float f6 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 10)]) - this.c;
/* 27 */     float f7 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 16)]) - this.a;
/* 28 */     float f8 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 17)]) - this.b;
/* 29 */     float f9 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 18)]) - this.c;
/* 30 */     float f10 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 24)]) - this.a;
/* 31 */     float f11 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 25)]) - this.b;
/* 32 */     float f12 = Float.intBitsToFloat(this.d[(paramInteger1.intValue() + 26)]) - this.c;
/*    */     
/* 34 */     float f13 = Float.intBitsToFloat(this.d[paramInteger2.intValue()]) - this.a;
/* 35 */     float f14 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 1)]) - this.b;
/* 36 */     float f15 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 2)]) - this.c;
/* 37 */     float f16 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 8)]) - this.a;
/* 38 */     float f17 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 9)]) - this.b;
/* 39 */     float f18 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 10)]) - this.c;
/* 40 */     float f19 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 16)]) - this.a;
/* 41 */     float f20 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 17)]) - this.b;
/* 42 */     float f21 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 18)]) - this.c;
/* 43 */     float f22 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 24)]) - this.a;
/* 44 */     float f23 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 25)]) - this.b;
/* 45 */     float f24 = Float.intBitsToFloat(this.d[(paramInteger2.intValue() + 26)]) - this.c;
/*    */     
/* 47 */     float f25 = (f1 + f4 + f7 + f10) * 0.25F;
/* 48 */     float f26 = (f2 + f5 + f8 + f11) * 0.25F;
/* 49 */     float f27 = (f3 + f6 + f9 + f12) * 0.25F;
/*    */     
/* 51 */     float f28 = (f13 + f16 + f19 + f22) * 0.25F;
/* 52 */     float f29 = (f14 + f17 + f20 + f23) * 0.25F;
/* 53 */     float f30 = (f15 + f18 + f21 + f24) * 0.25F;
/*    */     
/* 55 */     float f31 = f25 * f25 + f26 * f26 + f27 * f27;
/* 56 */     float f32 = f28 * f28 + f29 * f29 + f30 * f30;
/*    */     
/* 58 */     return Float.compare(f32, f31);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bme.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */