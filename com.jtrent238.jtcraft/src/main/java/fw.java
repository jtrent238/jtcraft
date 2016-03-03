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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fw
/*     */   extends ft
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private int k;
/*     */   
/*     */   public fw() {}
/*     */   
/*     */   public fw(sa paramsa, int paramInt)
/*     */   {
/*  50 */     this(paramsa, paramInt, 0);
/*     */   }
/*     */   
/*     */   public fw(sa paramsa, int paramInt1, int paramInt2) {
/*  54 */     this.a = paramsa.y();
/*  55 */     this.b = qh.c(paramsa.s * 32.0D);
/*  56 */     this.c = qh.c(paramsa.t * 32.0D);
/*  57 */     this.d = qh.c(paramsa.u * 32.0D);
/*  58 */     this.h = qh.d(paramsa.z * 256.0F / 360.0F);
/*  59 */     this.i = qh.d(paramsa.y * 256.0F / 360.0F);
/*  60 */     this.j = paramInt1;
/*  61 */     this.k = paramInt2;
/*  62 */     if (paramInt2 > 0) {
/*  63 */       double d1 = paramsa.v;
/*  64 */       double d2 = paramsa.w;
/*  65 */       double d3 = paramsa.x;
/*  66 */       double d4 = 3.9D;
/*  67 */       if (d1 < -d4) d1 = -d4;
/*  68 */       if (d2 < -d4) d2 = -d4;
/*  69 */       if (d3 < -d4) d3 = -d4;
/*  70 */       if (d1 > d4) d1 = d4;
/*  71 */       if (d2 > d4) d2 = d4;
/*  72 */       if (d3 > d4) d3 = d4;
/*  73 */       this.e = ((int)(d1 * 8000.0D));
/*  74 */       this.f = ((int)(d2 * 8000.0D));
/*  75 */       this.g = ((int)(d3 * 8000.0D));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  81 */     this.a = paramet.a();
/*  82 */     this.j = paramet.readByte();
/*  83 */     this.b = paramet.readInt();
/*  84 */     this.c = paramet.readInt();
/*  85 */     this.d = paramet.readInt();
/*  86 */     this.h = paramet.readByte();
/*  87 */     this.i = paramet.readByte();
/*  88 */     this.k = paramet.readInt();
/*  89 */     if (this.k > 0) {
/*  90 */       this.e = paramet.readShort();
/*  91 */       this.f = paramet.readShort();
/*  92 */       this.g = paramet.readShort();
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  98 */     paramet.b(this.a);
/*  99 */     paramet.writeByte(this.j);
/* 100 */     paramet.writeInt(this.b);
/* 101 */     paramet.writeInt(this.c);
/* 102 */     paramet.writeInt(this.d);
/* 103 */     paramet.writeByte(this.h);
/* 104 */     paramet.writeByte(this.i);
/* 105 */     paramet.writeInt(this.k);
/* 106 */     if (this.k > 0) {
/* 107 */       paramet.writeShort(this.e);
/* 108 */       paramet.writeShort(this.f);
/* 109 */       paramet.writeShort(this.g);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/* 115 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 120 */     return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.j), Float.valueOf(this.b / 32.0F), Float.valueOf(this.c / 32.0F), Float.valueOf(this.d / 32.0F) });
/*     */   }
/*     */   
/*     */   public int c() {
/* 124 */     return this.a;
/*     */   }
/*     */   
/*     */   public int d() {
/* 128 */     return this.b;
/*     */   }
/*     */   
/*     */   public int e() {
/* 132 */     return this.c;
/*     */   }
/*     */   
/*     */   public int f() {
/* 136 */     return this.d;
/*     */   }
/*     */   
/*     */   public int g() {
/* 140 */     return this.e;
/*     */   }
/*     */   
/*     */   public int h() {
/* 144 */     return this.f;
/*     */   }
/*     */   
/*     */   public int i() {
/* 148 */     return this.g;
/*     */   }
/*     */   
/*     */   public int j() {
/* 152 */     return this.h;
/*     */   }
/*     */   
/*     */   public int k() {
/* 156 */     return this.i;
/*     */   }
/*     */   
/*     */   public int l() {
/* 160 */     return this.j;
/*     */   }
/*     */   
/*     */   public int m() {
/* 164 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 168 */     this.b = paramInt;
/*     */   }
/*     */   
/*     */   public void b(int paramInt) {
/* 172 */     this.c = paramInt;
/*     */   }
/*     */   
/*     */   public void c(int paramInt) {
/* 176 */     this.d = paramInt;
/*     */   }
/*     */   
/*     */   public void d(int paramInt) {
/* 180 */     this.e = paramInt;
/*     */   }
/*     */   
/*     */   public void e(int paramInt) {
/* 184 */     this.f = paramInt;
/*     */   }
/*     */   
/*     */   public void f(int paramInt) {
/* 188 */     this.g = paramInt;
/*     */   }
/*     */   
/*     */   public void g(int paramInt) {
/* 192 */     this.k = paramInt;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */