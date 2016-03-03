/*     */ import java.nio.ByteBuffer;
/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public class bmg
/*     */ {
/*     */   public int a;
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*     */   public boolean e;
/*     */   public int f;
/*     */   public int g;
/*     */   public int h;
/*     */   public float[] i;
/*     */   public int j;
/*     */   
/*     */   public bmg(int paramInt1, int paramInt2, boolean paramBoolean)
/*     */   {
/*  34 */     this.e = paramBoolean;
/*     */     
/*  36 */     this.f = -1;
/*  37 */     this.g = -1;
/*  38 */     this.h = -1;
/*     */     
/*  40 */     this.i = new float[4];
/*  41 */     this.i[0] = 1.0F;
/*  42 */     this.i[1] = 1.0F;
/*  43 */     this.i[2] = 1.0F;
/*  44 */     this.i[3] = 0.0F;
/*     */     
/*  46 */     a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2) {
/*  50 */     if (!buu.g()) {
/*  51 */       this.c = paramInt1;
/*  52 */       this.d = paramInt2;
/*  53 */       return;
/*     */     }
/*  55 */     GL11.glEnable(2929);
/*     */     
/*  57 */     if (this.f >= 0) {
/*  58 */       a();
/*     */     }
/*  60 */     b(paramInt1, paramInt2);
/*  61 */     b();
/*     */     
/*     */ 
/*  64 */     buu.g(buu.e, 0);
/*     */   }
/*     */   
/*     */   public void a() {
/*  68 */     if (!buu.g()) {
/*  69 */       return;
/*     */     }
/*     */     
/*  72 */     d();
/*  73 */     e();
/*     */     
/*  75 */     if (this.h > -1) {
/*  76 */       buu.g(this.h);
/*  77 */       this.h = -1;
/*     */     }
/*  79 */     if (this.g > -1) {
/*  80 */       bqi.a(this.g);
/*  81 */       this.g = -1;
/*     */     }
/*  83 */     if (this.f > -1) {
/*  84 */       buu.g(buu.e, 0);
/*  85 */       buu.h(this.f);
/*  86 */       this.f = -1;
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/*  91 */     this.c = paramInt1;
/*  92 */     this.d = paramInt2;
/*     */     
/*  94 */     this.a = paramInt1;
/*  95 */     this.b = paramInt2;
/*     */     
/*  97 */     if (!buu.g()) {
/*  98 */       f();
/*  99 */       return;
/*     */     }
/*     */     
/* 102 */     this.f = buu.e();
/* 103 */     this.g = bqi.a();
/* 104 */     if (this.e) {
/* 105 */       this.h = buu.f();
/*     */     }
/*     */     
/* 108 */     a(9728);
/* 109 */     GL11.glBindTexture(3553, this.g);
/* 110 */     GL11.glTexImage2D(3553, 0, 32856, this.a, this.b, 0, 6408, 5121, (ByteBuffer)null);
/*     */     
/* 112 */     buu.g(buu.e, this.f);
/* 113 */     buu.a(buu.e, buu.g, 3553, this.g, 0);
/*     */     
/* 115 */     if (this.e)
/*     */     {
/* 117 */       buu.h(buu.f, this.h);
/*     */       
/*     */ 
/* 120 */       buu.a(buu.f, 33190, this.a, this.b);
/*     */       
/*     */ 
/* 123 */       buu.b(buu.e, buu.h, buu.f, this.h);
/*     */     }
/*     */     
/* 126 */     f();
/* 127 */     d();
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 131 */     if (buu.g()) {
/* 132 */       this.j = paramInt;
/* 133 */       GL11.glBindTexture(3553, this.g);
/* 134 */       GL11.glTexParameterf(3553, 10241, paramInt);
/* 135 */       GL11.glTexParameterf(3553, 10240, paramInt);
/* 136 */       GL11.glTexParameterf(3553, 10242, 10496.0F);
/* 137 */       GL11.glTexParameterf(3553, 10243, 10496.0F);
/* 138 */       GL11.glBindTexture(3553, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b() {
/* 143 */     int k = buu.i(buu.e);
/* 144 */     if (k == buu.i)
/* 145 */       return;
/* 146 */     if (k == buu.j)
/* 147 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
/* 148 */     if (k == buu.k)
/* 149 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
/* 150 */     if (k == buu.l)
/* 151 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
/* 152 */     if (k == buu.m) {
/* 153 */       throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
/*     */     }
/* 155 */     throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + k);
/*     */   }
/*     */   
/*     */   public void c()
/*     */   {
/* 160 */     if (buu.g()) {
/* 161 */       GL11.glBindTexture(3553, this.g);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void d()
/*     */   {
/* 173 */     if (buu.g()) {
/* 174 */       GL11.glBindTexture(3553, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 179 */     if (buu.g()) {
/* 180 */       buu.g(buu.e, this.f);
/* 181 */       if (paramBoolean) {
/* 182 */         GL11.glViewport(0, 0, this.c, this.d);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 188 */     if (buu.g()) {
/* 189 */       buu.g(buu.e, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 194 */     this.i[0] = paramFloat1;
/* 195 */     this.i[1] = paramFloat2;
/* 196 */     this.i[2] = paramFloat3;
/* 197 */     this.i[3] = paramFloat4;
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2) {
/* 201 */     if (!buu.g()) {
/* 202 */       return;
/*     */     }
/* 204 */     GL11.glColorMask(true, true, true, false);
/* 205 */     GL11.glDisable(2929);
/* 206 */     GL11.glDepthMask(false);
/*     */     
/* 208 */     GL11.glMatrixMode(5889);
/* 209 */     GL11.glLoadIdentity();
/* 210 */     GL11.glOrtho(0.0D, paramInt1, paramInt2, 0.0D, 1000.0D, 3000.0D);
/* 211 */     GL11.glMatrixMode(5888);
/* 212 */     GL11.glLoadIdentity();
/* 213 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*     */     
/* 215 */     GL11.glViewport(0, 0, paramInt1, paramInt2);
/*     */     
/* 217 */     GL11.glEnable(3553);
/* 218 */     GL11.glDisable(2896);
/* 219 */     GL11.glDisable(3008);
/* 220 */     GL11.glDisable(3042);
/*     */     
/* 222 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 223 */     GL11.glEnable(2903);
/*     */     
/* 225 */     c();
/*     */     
/* 227 */     float f1 = paramInt1;
/* 228 */     float f2 = paramInt2;
/* 229 */     float f3 = this.c / this.a;
/* 230 */     float f4 = this.d / this.b;
/*     */     
/* 232 */     bmh localbmh = bmh.a;
/* 233 */     localbmh.b();
/* 234 */     localbmh.c(-1);
/* 235 */     localbmh.a(0.0D, f2, 0.0D, 0.0D, 0.0D);
/* 236 */     localbmh.a(f1, f2, 0.0D, f3, 0.0D);
/* 237 */     localbmh.a(f1, 0.0D, 0.0D, f3, f4);
/* 238 */     localbmh.a(0.0D, 0.0D, 0.0D, 0.0D, f4);
/* 239 */     localbmh.a();
/*     */     
/* 241 */     d();
/*     */     
/* 243 */     GL11.glDepthMask(true);
/* 244 */     GL11.glColorMask(true, true, true, true);
/*     */   }
/*     */   
/*     */   public void f() {
/* 248 */     a(true);
/* 249 */     GL11.glClearColor(this.i[0], this.i[1], this.i[2], this.i[3]);
/*     */     
/* 251 */     int k = 16384;
/* 252 */     if (this.e) {
/* 253 */       GL11.glClearDepth(1.0D);
/* 254 */       k |= 0x100;
/*     */     }
/* 256 */     GL11.glClear(k);
/* 257 */     e();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */