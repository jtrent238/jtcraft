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
/*     */ public class bht
/*     */   extends bhr
/*     */ {
/*     */   bix a;
/*     */   bix b;
/*     */   bix c;
/*     */   bix d;
/*     */   bix e;
/*     */   bix f;
/*     */   bix g;
/*     */   bix h;
/*  22 */   int i = 1;
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
/*     */   public bht()
/*     */   {
/*  43 */     a("head.main", 0, 0);
/*  44 */     a("head.nose", 0, 24);
/*  45 */     a("head.ear1", 0, 10);
/*  46 */     a("head.ear2", 6, 10);
/*     */     
/*  48 */     this.g = new bix(this, "head");
/*  49 */     this.g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
/*  50 */     this.g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
/*  51 */     this.g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
/*  52 */     this.g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
/*  53 */     this.g.a(0.0F, 15.0F, -9.0F);
/*     */     
/*  55 */     this.h = new bix(this, 20, 0);
/*  56 */     this.h.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
/*  57 */     this.h.a(0.0F, 12.0F, -10.0F);
/*     */     
/*  59 */     this.e = new bix(this, 0, 15);
/*  60 */     this.e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
/*  61 */     this.e.f = 0.9F;
/*  62 */     this.e.a(0.0F, 15.0F, 8.0F);
/*     */     
/*  64 */     this.f = new bix(this, 4, 15);
/*  65 */     this.f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
/*  66 */     this.f.a(0.0F, 20.0F, 14.0F);
/*     */     
/*  68 */     this.a = new bix(this, 8, 13);
/*  69 */     this.a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
/*  70 */     this.a.a(1.1F, 18.0F, 5.0F);
/*     */     
/*  72 */     this.b = new bix(this, 8, 13);
/*  73 */     this.b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
/*  74 */     this.b.a(-1.1F, 18.0F, 5.0F);
/*     */     
/*  76 */     this.c = new bix(this, 40, 0);
/*  77 */     this.c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
/*  78 */     this.c.a(1.2F, 13.8F, -5.0F);
/*     */     
/*  80 */     this.d = new bix(this, 40, 0);
/*  81 */     this.d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
/*  82 */     this.d.a(-1.2F, 13.8F, -5.0F);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  87 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*  88 */     if (this.s) {
/*  89 */       float f1 = 2.0F;
/*  90 */       GL11.glPushMatrix();
/*  91 */       GL11.glScalef(1.5F / f1, 1.5F / f1, 1.5F / f1);
/*  92 */       GL11.glTranslatef(0.0F, 10.0F * paramFloat6, 4.0F * paramFloat6);
/*  93 */       this.g.a(paramFloat6);
/*  94 */       GL11.glPopMatrix();
/*  95 */       GL11.glPushMatrix();
/*  96 */       GL11.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  97 */       GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  98 */       this.h.a(paramFloat6);
/*  99 */       this.a.a(paramFloat6);
/* 100 */       this.b.a(paramFloat6);
/* 101 */       this.c.a(paramFloat6);
/* 102 */       this.d.a(paramFloat6);
/* 103 */       this.e.a(paramFloat6);
/* 104 */       this.f.a(paramFloat6);
/* 105 */       GL11.glPopMatrix();
/*     */     } else {
/* 107 */       this.g.a(paramFloat6);
/* 108 */       this.h.a(paramFloat6);
/* 109 */       this.e.a(paramFloat6);
/* 110 */       this.f.a(paramFloat6);
/* 111 */       this.a.a(paramFloat6);
/* 112 */       this.b.a(paramFloat6);
/* 113 */       this.c.a(paramFloat6);
/* 114 */       this.d.a(paramFloat6);
/*     */     }
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*     */   {
/* 152 */     this.g.f = (paramFloat5 / 57.295776F);
/* 153 */     this.g.g = (paramFloat4 / 57.295776F);
/*     */     
/* 155 */     if (this.i != 3) {
/* 156 */       this.h.f = 1.5707964F;
/* 157 */       if (this.i == 2) {
/* 158 */         this.a.f = (qh.b(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/* 159 */         this.b.f = (qh.b(paramFloat1 * 0.6662F + 0.3F) * 1.0F * paramFloat2);
/* 160 */         this.c.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F + 0.3F) * 1.0F * paramFloat2);
/* 161 */         this.d.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2);
/* 162 */         this.f.f = (1.7278761F + 0.31415927F * qh.b(paramFloat1) * paramFloat2);
/*     */       } else {
/* 164 */         this.a.f = (qh.b(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/* 165 */         this.b.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2);
/* 166 */         this.c.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.0F * paramFloat2);
/* 167 */         this.d.f = (qh.b(paramFloat1 * 0.6662F) * 1.0F * paramFloat2);
/*     */         
/* 169 */         if (this.i == 1) this.f.f = (1.7278761F + 0.7853982F * qh.b(paramFloat1) * paramFloat2); else {
/* 170 */           this.f.f = (1.7278761F + 0.47123894F * qh.b(paramFloat1) * paramFloat2);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 177 */     wn localwn = (wn)paramsv;
/*     */     
/* 179 */     this.h.d = 12.0F;
/* 180 */     this.h.e = -10.0F;
/* 181 */     this.g.d = 15.0F;
/* 182 */     this.g.e = -9.0F;
/* 183 */     this.e.d = 15.0F;
/* 184 */     this.e.e = 8.0F;
/* 185 */     this.f.d = 20.0F;
/* 186 */     this.f.e = 14.0F;
/* 187 */     this.c.d = (this.d.d = 13.8F);
/* 188 */     this.c.e = (this.d.e = -5.0F);
/* 189 */     this.a.d = (this.b.d = 18.0F);
/* 190 */     this.a.e = (this.b.e = 5.0F);
/* 191 */     this.e.f = 0.9F;
/*     */     
/* 193 */     if (localwn.an()) {
/* 194 */       this.h.d += 1.0F;
/* 195 */       this.g.d += 2.0F;
/* 196 */       this.e.d += 1.0F;
/* 197 */       this.f.d += -4.0F;
/* 198 */       this.f.e += 2.0F;
/* 199 */       this.e.f = 1.5707964F;
/* 200 */       this.f.f = 1.5707964F;
/* 201 */       this.i = 0;
/* 202 */     } else if (localwn.ao()) {
/* 203 */       this.f.d = this.e.d;
/* 204 */       this.f.e += 2.0F;
/* 205 */       this.e.f = 1.5707964F;
/* 206 */       this.f.f = 1.5707964F;
/* 207 */       this.i = 2;
/* 208 */     } else if (localwn.ca()) {
/* 209 */       this.h.f = 0.7853982F;
/* 210 */       this.h.d += -4.0F;
/* 211 */       this.h.e += 5.0F;
/* 212 */       this.g.d += -3.3F;
/* 213 */       this.g.e += 1.0F;
/*     */       
/* 215 */       this.e.d += 8.0F;
/* 216 */       this.e.e += -2.0F;
/* 217 */       this.f.d += 2.0F;
/* 218 */       this.f.e += -0.8F;
/* 219 */       this.e.f = 1.7278761F;
/* 220 */       this.f.f = 2.670354F;
/*     */       
/* 222 */       this.c.f = (this.d.f = -0.15707964F);
/* 223 */       this.c.d = (this.d.d = 15.8F);
/* 224 */       this.c.e = (this.d.e = -7.0F);
/*     */       
/* 226 */       this.a.f = (this.b.f = -1.5707964F);
/* 227 */       this.a.d = (this.b.d = 21.0F);
/* 228 */       this.a.e = (this.b.e = 1.0F);
/* 229 */       this.i = 3;
/*     */     } else {
/* 231 */       this.i = 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bht.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */