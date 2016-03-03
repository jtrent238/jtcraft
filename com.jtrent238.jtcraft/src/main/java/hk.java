/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hk
/*     */   extends ft
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   public hk() {}
/*     */   
/*     */   public hk(yw paramyw)
/*     */   {
/*  28 */     a(paramyw.a);
/*  29 */     b(paramyw.b);
/*  30 */     c(paramyw.c);
/*  31 */     d(paramyw.d);
/*  32 */     a(paramyw.a());
/*  33 */     b(paramyw.b());
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  38 */     int i = paramet.readByte();
/*     */     
/*  40 */     a((i & 0x1) > 0);
/*  41 */     b((i & 0x2) > 0);
/*  42 */     c((i & 0x4) > 0);
/*  43 */     d((i & 0x8) > 0);
/*  44 */     a(paramet.readFloat());
/*  45 */     b(paramet.readFloat());
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  50 */     int i = 0;
/*     */     
/*  52 */     if (c()) i = (byte)(i | 0x1);
/*  53 */     if (d()) i = (byte)(i | 0x2);
/*  54 */     if (e()) i = (byte)(i | 0x4);
/*  55 */     if (f()) { i = (byte)(i | 0x8);
/*     */     }
/*  57 */     paramet.writeByte(i);
/*  58 */     paramet.writeFloat(this.e);
/*  59 */     paramet.writeFloat(this.f);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  64 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  69 */     return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", new Object[] { Boolean.valueOf(c()), Boolean.valueOf(d()), Boolean.valueOf(e()), Boolean.valueOf(f()), Float.valueOf(g()), Float.valueOf(h()) });
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  73 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  77 */     this.a = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  81 */     return this.b;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/*  85 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  89 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(boolean paramBoolean) {
/*  93 */     this.c = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  97 */     return this.d;
/*     */   }
/*     */   
/*     */   public void d(boolean paramBoolean) {
/* 101 */     this.d = paramBoolean;
/*     */   }
/*     */   
/*     */   public float g() {
/* 105 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 109 */     this.e = paramFloat;
/*     */   }
/*     */   
/*     */   public float h() {
/* 113 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 117 */     this.f = paramFloat;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */