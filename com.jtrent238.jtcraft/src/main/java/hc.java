/*    */ import org.apache.commons.lang3.Validate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hc
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private int b;
/* 17 */   private int c = Integer.MAX_VALUE;
/*    */   
/*    */   private int d;
/*    */   private float e;
/*    */   private int f;
/*    */   
/*    */   public hc() {}
/*    */   
/*    */   public hc(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 27 */     Validate.notNull(paramString, "name", new Object[0]);
/* 28 */     this.a = paramString;
/* 29 */     this.b = ((int)(paramDouble1 * 8.0D));
/* 30 */     this.c = ((int)(paramDouble2 * 8.0D));
/* 31 */     this.d = ((int)(paramDouble3 * 8.0D));
/* 32 */     this.e = paramFloat1;
/* 33 */     this.f = ((int)(paramFloat2 * 63.0F));
/*    */     
/* 35 */     if (this.f < 0) this.f = 0;
/* 36 */     if (this.f > 255) this.f = 255;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 41 */     this.a = paramet.c(256);
/* 42 */     this.b = paramet.readInt();
/* 43 */     this.c = paramet.readInt();
/* 44 */     this.d = paramet.readInt();
/* 45 */     this.e = paramet.readFloat();
/* 46 */     this.f = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 51 */     paramet.a(this.a);
/* 52 */     paramet.writeInt(this.b);
/* 53 */     paramet.writeInt(this.c);
/* 54 */     paramet.writeInt(this.d);
/* 55 */     paramet.writeFloat(this.e);
/* 56 */     paramet.writeByte(this.f);
/*    */   }
/*    */   
/*    */   public String c() {
/* 60 */     return this.a;
/*    */   }
/*    */   
/*    */   public double d() {
/* 64 */     return this.b / 8.0F;
/*    */   }
/*    */   
/*    */   public double e() {
/* 68 */     return this.c / 8.0F;
/*    */   }
/*    */   
/*    */   public double f() {
/* 72 */     return this.d / 8.0F;
/*    */   }
/*    */   
/*    */   public float g() {
/* 76 */     return this.e;
/*    */   }
/*    */   
/*    */   public float h() {
/* 80 */     return this.f / 63.0F;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 85 */     paramfv.a(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */