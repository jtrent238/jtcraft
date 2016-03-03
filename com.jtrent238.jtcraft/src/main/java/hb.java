/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hb
/*     */   extends ft
/*     */ {
/*     */   private String a;
/*     */   private float b;
/*     */   private float c;
/*     */   private float d;
/*     */   private float e;
/*     */   private float f;
/*     */   private float g;
/*     */   private float h;
/*     */   private int i;
/*     */   
/*     */   public hb() {}
/*     */   
/*     */   public hb(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt)
/*     */   {
/*  25 */     this.a = paramString;
/*  26 */     this.b = paramFloat1;
/*  27 */     this.c = paramFloat2;
/*  28 */     this.d = paramFloat3;
/*  29 */     this.e = paramFloat4;
/*  30 */     this.f = paramFloat5;
/*  31 */     this.g = paramFloat6;
/*  32 */     this.h = paramFloat7;
/*  33 */     this.i = paramInt;
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  38 */     this.a = paramet.c(64);
/*  39 */     this.b = paramet.readFloat();
/*  40 */     this.c = paramet.readFloat();
/*  41 */     this.d = paramet.readFloat();
/*  42 */     this.e = paramet.readFloat();
/*  43 */     this.f = paramet.readFloat();
/*  44 */     this.g = paramet.readFloat();
/*  45 */     this.h = paramet.readFloat();
/*  46 */     this.i = paramet.readInt();
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  51 */     paramet.a(this.a);
/*  52 */     paramet.writeFloat(this.b);
/*  53 */     paramet.writeFloat(this.c);
/*  54 */     paramet.writeFloat(this.d);
/*  55 */     paramet.writeFloat(this.e);
/*  56 */     paramet.writeFloat(this.f);
/*  57 */     paramet.writeFloat(this.g);
/*  58 */     paramet.writeFloat(this.h);
/*  59 */     paramet.writeInt(this.i);
/*     */   }
/*     */   
/*     */   public String c() {
/*  63 */     return this.a;
/*     */   }
/*     */   
/*     */   public double d()
/*     */   {
/*  68 */     return this.b;
/*     */   }
/*     */   
/*     */   public double e() {
/*  72 */     return this.c;
/*     */   }
/*     */   
/*     */   public double f() {
/*  76 */     return this.d;
/*     */   }
/*     */   
/*     */   public float g() {
/*  80 */     return this.e;
/*     */   }
/*     */   
/*     */   public float h() {
/*  84 */     return this.f;
/*     */   }
/*     */   
/*     */   public float i() {
/*  88 */     return this.g;
/*     */   }
/*     */   
/*     */   public float j() {
/*  92 */     return this.h;
/*     */   }
/*     */   
/*     */   public int k() {
/*  96 */     return this.i;
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 101 */     paramfv.a(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */