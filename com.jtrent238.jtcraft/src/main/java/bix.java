/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class bix
/*     */ {
/*  16 */   public float a = 64.0F;
/*  17 */   public float b = 32.0F;
/*     */   private int r;
/*     */   private int s;
/*     */   public float c;
/*     */   public float d;
/*     */   public float e;
/*     */   public float f;
/*     */   public float g;
/*     */   public float h;
/*     */   private boolean t;
/*     */   private int u;
/*  28 */   public boolean i; public boolean j = true;
/*     */   
/*     */   public boolean k;
/*  31 */   public List l = new ArrayList();
/*     */   public List m;
/*     */   public final String n;
/*     */   private bhr v;
/*     */   public float o;
/*     */   public float p;
/*     */   public float q;
/*     */   
/*  39 */   public bix(bhr parambhr, String paramString) { this.v = parambhr;
/*  40 */     parambhr.r.add(this);
/*  41 */     this.n = paramString;
/*  42 */     b(parambhr.t, parambhr.u);
/*     */   }
/*     */   
/*     */   public bix(bhr parambhr) {
/*  46 */     this(parambhr, null);
/*     */   }
/*     */   
/*     */   public bix(bhr parambhr, int paramInt1, int paramInt2) {
/*  50 */     this(parambhr);
/*  51 */     a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void a(bix parambix) {
/*  55 */     if (this.m == null) this.m = new ArrayList();
/*  56 */     this.m.add(parambix);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bix a(int paramInt1, int paramInt2)
/*     */   {
/*  65 */     this.r = paramInt1;
/*  66 */     this.s = paramInt2;
/*  67 */     return this;
/*     */   }
/*     */   
/*     */   public bix a(String paramString, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3) {
/*  71 */     paramString = this.n + "." + paramString;
/*  72 */     biy localbiy = this.v.a(paramString);
/*  73 */     a(localbiy.a, localbiy.b);
/*  74 */     this.l.add(new bis(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F).a(paramString));
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   public bix a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3) {
/*  79 */     this.l.add(new bis(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, 0.0F));
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, float paramFloat4) {
/*  84 */     this.l.add(new bis(this, this.r, this.s, paramFloat1, paramFloat2, paramFloat3, paramInt1, paramInt2, paramInt3, paramFloat4));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  92 */     this.c = paramFloat1;
/*  93 */     this.d = paramFloat2;
/*  94 */     this.e = paramFloat3;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat) {
/*  98 */     if (this.k) return;
/*  99 */     if (!this.j) return;
/* 100 */     if (!this.t) { d(paramFloat);
/*     */     }
/* 102 */     GL11.glTranslatef(this.o, this.p, this.q);
/*     */     int i1;
/* 104 */     if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F)) {
/* 105 */       GL11.glPushMatrix();
/* 106 */       GL11.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 107 */       if (this.h != 0.0F) GL11.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 108 */       if (this.g != 0.0F) GL11.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 109 */       if (this.f != 0.0F) GL11.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 110 */       GL11.glCallList(this.u);
/* 111 */       if (this.m != null) {
/* 112 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 113 */           ((bix)this.m.get(i1)).a(paramFloat);
/*     */         }
/*     */       }
/* 116 */       GL11.glPopMatrix();
/* 117 */     } else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F)) {
/* 118 */       GL11.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 119 */       GL11.glCallList(this.u);
/* 120 */       if (this.m != null) {
/* 121 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 122 */           ((bix)this.m.get(i1)).a(paramFloat);
/*     */         }
/*     */       }
/* 125 */       GL11.glTranslatef(-this.c * paramFloat, -this.d * paramFloat, -this.e * paramFloat);
/*     */     } else {
/* 127 */       GL11.glCallList(this.u);
/* 128 */       if (this.m != null) {
/* 129 */         for (i1 = 0; i1 < this.m.size(); i1++) {
/* 130 */           ((bix)this.m.get(i1)).a(paramFloat);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 135 */     GL11.glTranslatef(-this.o, -this.p, -this.q);
/*     */   }
/*     */   
/*     */   public void b(float paramFloat) {
/* 139 */     if (this.k) return;
/* 140 */     if (!this.j) return;
/* 141 */     if (!this.t) { d(paramFloat);
/*     */     }
/* 143 */     GL11.glPushMatrix();
/* 144 */     GL11.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 145 */     if (this.g != 0.0F) GL11.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 146 */     if (this.f != 0.0F) GL11.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 147 */     if (this.h != 0.0F) GL11.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 148 */     GL11.glCallList(this.u);
/* 149 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */   public void c(float paramFloat)
/*     */   {
/* 154 */     if (this.k) return;
/* 155 */     if (!this.j) return;
/* 156 */     if (!this.t) { d(paramFloat);
/*     */     }
/* 158 */     if ((this.f != 0.0F) || (this.g != 0.0F) || (this.h != 0.0F)) {
/* 159 */       GL11.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/* 160 */       if (this.h != 0.0F) GL11.glRotatef(this.h * 57.295776F, 0.0F, 0.0F, 1.0F);
/* 161 */       if (this.g != 0.0F) GL11.glRotatef(this.g * 57.295776F, 0.0F, 1.0F, 0.0F);
/* 162 */       if (this.f != 0.0F) GL11.glRotatef(this.f * 57.295776F, 1.0F, 0.0F, 0.0F);
/* 163 */     } else if ((this.c != 0.0F) || (this.d != 0.0F) || (this.e != 0.0F)) {
/* 164 */       GL11.glTranslatef(this.c * paramFloat, this.d * paramFloat, this.e * paramFloat);
/*     */     }
/*     */   }
/*     */   
/*     */   private void d(float paramFloat) {
/* 169 */     this.u = ban.a(1);
/*     */     
/* 171 */     GL11.glNewList(this.u, 4864);
/* 172 */     bmh localbmh = bmh.a;
/* 173 */     for (int i1 = 0; i1 < this.l.size(); i1++) {
/* 174 */       ((bis)this.l.get(i1)).a(localbmh, paramFloat);
/*     */     }
/* 176 */     GL11.glEndList();
/*     */     
/* 178 */     this.t = true;
/*     */   }
/*     */   
/*     */   public bix b(int paramInt1, int paramInt2) {
/* 182 */     this.a = paramInt1;
/* 183 */     this.b = paramInt2;
/* 184 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */