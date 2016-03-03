/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bkn
/*     */ {
/*  27 */   private static final bqx b = new bqx("textures/particle/particles.png");
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected ahb a;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*  38 */   private List[] c = new List[4];
/*     */   private bqf d;
/*  40 */   private Random e = new Random();
/*     */   
/*     */   public bkn(ahb paramahb, bqf parambqf) {
/*  43 */     if (paramahb != null) {
/*  44 */       this.a = paramahb;
/*     */     }
/*  46 */     this.d = parambqf;
/*  47 */     for (int i = 0; i < 4; i++) {
/*  48 */       this.c[i] = new ArrayList();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bkm parambkm) {
/*  53 */     int i = parambkm.a();
/*  54 */     if (this.c[i].size() >= 4000) this.c[i].remove(0);
/*  55 */     this.c[i].add(parambkm);
/*     */   }
/*     */   
/*     */   public void a() {
/*  59 */     for (int i = 0; i < 4; i++) {
/*  60 */       for (int j = 0; j < this.c[i].size(); j++) {
/*  61 */         bkm localbkm = (bkm)this.c[i].get(j);
/*     */         try
/*     */         {
/*  64 */           localbkm.h();
/*     */         } catch (Throwable localThrowable) {
/*  66 */           b localb = b.a(localThrowable, "Ticking Particle");
/*  67 */           k localk = localb.a("Particle being ticked");
/*  68 */           int k = i;
/*     */           
/*  70 */           localk.a("Particle", new bko(this, localbkm));
/*     */           
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */           localk.a("Particle Type", new bkp(this, k));
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
/*  94 */           throw new s(localb);
/*     */         }
/*     */         
/*  97 */         if (localbkm.K) {
/*  98 */           this.c[i].remove(j--);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat) {
/* 105 */     float f1 = baj.d;
/* 106 */     float f2 = baj.f;
/*     */     
/* 108 */     float f3 = baj.g;
/* 109 */     float f4 = baj.h;
/* 110 */     float f5 = baj.e;
/*     */     
/* 112 */     bkm.ay = paramsa.S + (paramsa.s - paramsa.S) * paramFloat;
/* 113 */     bkm.az = paramsa.T + (paramsa.t - paramsa.T) * paramFloat;
/* 114 */     bkm.aA = paramsa.U + (paramsa.u - paramsa.U) * paramFloat;
/* 115 */     for (int i = 0; i < 3; i++)
/* 116 */       if (!this.c[i].isEmpty())
/*     */       {
/* 118 */         switch (i) {
/*     */         case 0: 
/*     */         default: 
/* 121 */           this.d.a(b);
/* 122 */           break;
/*     */         case 1: 
/* 124 */           this.d.a(bpz.b);
/* 125 */           break;
/*     */         case 2: 
/* 127 */           this.d.a(bpz.c);
/*     */         }
/*     */         
/* 130 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 131 */         GL11.glDepthMask(false);
/* 132 */         GL11.glEnable(3042);
/* 133 */         GL11.glBlendFunc(770, 771);
/* 134 */         GL11.glAlphaFunc(516, 0.003921569F);
/*     */         
/* 136 */         bmh localbmh = bmh.a;
/* 137 */         localbmh.b();
/* 138 */         for (int j = 0; j < this.c[i].size(); j++) {
/* 139 */           bkm localbkm = (bkm)this.c[i].get(j);
/*     */           
/* 141 */           localbmh.b(localbkm.c(paramFloat));
/*     */           try
/*     */           {
/* 144 */             localbkm.a(localbmh, paramFloat, f1, f5, f2, f3, f4);
/*     */           } catch (Throwable localThrowable) {
/* 146 */             b localb = b.a(localThrowable, "Rendering Particle");
/* 147 */             k localk = localb.a("Particle being rendered");
/* 148 */             int k = i;
/*     */             
/* 150 */             localk.a("Particle", new bkq(this, localbkm));
/*     */             
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 157 */             localk.a("Particle Type", new bkr(this, k));
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
/* 174 */             throw new s(localb);
/*     */           }
/*     */         }
/* 177 */         localbmh.a();
/* 178 */         GL11.glDisable(3042);
/* 179 */         GL11.glDepthMask(true);
/* 180 */         GL11.glAlphaFunc(516, 0.1F);
/*     */       }
/*     */   }
/*     */   
/*     */   public void b(sa paramsa, float paramFloat) {
/* 185 */     float f1 = 0.017453292F;
/* 186 */     float f2 = qh.b(paramsa.y * 0.017453292F);
/* 187 */     float f3 = qh.a(paramsa.y * 0.017453292F);
/*     */     
/* 189 */     float f4 = -f3 * qh.a(paramsa.z * 0.017453292F);
/* 190 */     float f5 = f2 * qh.a(paramsa.z * 0.017453292F);
/* 191 */     float f6 = qh.b(paramsa.z * 0.017453292F);
/*     */     
/* 193 */     int i = 3;
/* 194 */     List localList = this.c[i];
/* 195 */     if (localList.isEmpty()) { return;
/*     */     }
/* 197 */     bmh localbmh = bmh.a;
/* 198 */     for (int j = 0; j < localList.size(); j++) {
/* 199 */       bkm localbkm = (bkm)localList.get(j);
/* 200 */       localbmh.b(localbkm.c(paramFloat));
/* 201 */       localbkm.a(localbmh, paramFloat, f2, f6, f3, f4, f5);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb) {
/* 206 */     this.a = paramahb;
/* 207 */     for (int i = 0; i < 4; i++) {
/* 208 */       this.c[i].clear();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4) {
/* 213 */     if (paramaji.o() == awt.a) return;
/* 214 */     int i = 4;
/* 215 */     for (int j = 0; j < i; j++) {
/* 216 */       for (int k = 0; k < i; k++) {
/* 217 */         for (int m = 0; m < i; m++) {
/* 218 */           double d1 = paramInt1 + (j + 0.5D) / i;
/* 219 */           double d2 = paramInt2 + (k + 0.5D) / i;
/* 220 */           double d3 = paramInt3 + (m + 0.5D) / i;
/* 221 */           a(new bld(this.a, d1, d2, d3, d1 - paramInt1 - 0.5D, d2 - paramInt2 - 0.5D, d3 - paramInt3 - 0.5D, paramaji, paramInt4).a(paramInt1, paramInt2, paramInt3));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/* 228 */     aji localaji = this.a.a(paramInt1, paramInt2, paramInt3);
/* 229 */     if (localaji.o() == awt.a) return;
/* 230 */     float f = 0.1F;
/* 231 */     double d1 = paramInt1 + this.e.nextDouble() * (localaji.y() - localaji.x() - f * 2.0F) + f + localaji.x();
/* 232 */     double d2 = paramInt2 + this.e.nextDouble() * (localaji.A() - localaji.z() - f * 2.0F) + f + localaji.z();
/* 233 */     double d3 = paramInt3 + this.e.nextDouble() * (localaji.C() - localaji.B() - f * 2.0F) + f + localaji.B();
/* 234 */     if (paramInt4 == 0) d2 = paramInt2 + localaji.z() - f;
/* 235 */     if (paramInt4 == 1) d2 = paramInt2 + localaji.A() + f;
/* 236 */     if (paramInt4 == 2) d3 = paramInt3 + localaji.B() - f;
/* 237 */     if (paramInt4 == 3) d3 = paramInt3 + localaji.C() + f;
/* 238 */     if (paramInt4 == 4) d1 = paramInt1 + localaji.x() - f;
/* 239 */     if (paramInt4 == 5) d1 = paramInt1 + localaji.y() + f;
/* 240 */     a(new bld(this.a, d1, d2, d3, 0.0D, 0.0D, 0.0D, localaji, this.a.e(paramInt1, paramInt2, paramInt3)).a(paramInt1, paramInt2, paramInt3).a(0.2F).f(0.6F));
/*     */   }
/*     */   
/*     */   public String b() {
/* 244 */     return "" + (this.c[0].size() + this.c[1].size() + this.c[2].size());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bkn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */