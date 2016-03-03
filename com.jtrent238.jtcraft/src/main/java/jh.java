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
/*     */ public class jh
/*     */   extends ft
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private float e;
/*     */   private float f;
/*     */   
/*     */   public jh() {}
/*     */   
/*     */   public jh(yw paramyw)
/*     */   {
/*  26 */     a(paramyw.a);
/*  27 */     b(paramyw.b);
/*  28 */     c(paramyw.c);
/*  29 */     d(paramyw.d);
/*  30 */     a(paramyw.a());
/*  31 */     b(paramyw.b());
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  36 */     int i = paramet.readByte();
/*     */     
/*  38 */     a((i & 0x1) > 0);
/*  39 */     b((i & 0x2) > 0);
/*  40 */     c((i & 0x4) > 0);
/*  41 */     d((i & 0x8) > 0);
/*  42 */     a(paramet.readFloat());
/*  43 */     b(paramet.readFloat());
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  48 */     int i = 0;
/*     */     
/*  50 */     if (c()) i = (byte)(i | 0x1);
/*  51 */     if (d()) i = (byte)(i | 0x2);
/*  52 */     if (e()) i = (byte)(i | 0x4);
/*  53 */     if (f()) { i = (byte)(i | 0x8);
/*     */     }
/*  55 */     paramet.writeByte(i);
/*  56 */     paramet.writeFloat(this.e);
/*  57 */     paramet.writeFloat(this.f);
/*     */   }
/*     */   
/*     */   public void a(io paramio)
/*     */   {
/*  62 */     paramio.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/*  67 */     return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", new Object[] { Boolean.valueOf(c()), Boolean.valueOf(d()), Boolean.valueOf(e()), Boolean.valueOf(f()), Float.valueOf(g()), Float.valueOf(h()) });
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  71 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  75 */     this.a = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  79 */     return this.b;
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/*  83 */     this.b = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  87 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(boolean paramBoolean) {
/*  91 */     this.c = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  95 */     return this.d;
/*     */   }
/*     */   
/*     */   public void d(boolean paramBoolean) {
/*  99 */     this.d = paramBoolean;
/*     */   }
/*     */   
/*     */   public float g() {
/* 103 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/* 107 */     this.e = paramFloat;
/*     */   }
/*     */   
/*     */   public float h() {
/* 111 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 115 */     this.f = paramFloat;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */