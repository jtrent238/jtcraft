/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bnn
/*     */ {
/*  35 */   private Map q = new HashMap();
/*     */   
/*  37 */   public static bnn a = new bnn();
/*     */   
/*     */   private bbu r;
/*     */   
/*     */   public static double b;
/*     */   
/*     */   public static double c;
/*     */   
/*     */   public static double d;
/*     */   
/*     */   public bqf e;
/*     */   public bly f;
/*     */   public ahb g;
/*     */   public sv h;
/*     */   
/*     */   private bnn()
/*     */   {
/*  54 */     this.q.put(xy.class, new bnf());
/*  55 */     this.q.put(yn.class, new bov());
/*  56 */     this.q.put(wo.class, new boo(new bhu(), new bhu(0.5F), 0.7F));
/*  57 */     this.q.put(wp.class, new boq(new bhy(), new bhx(), 0.7F));
/*  58 */     this.q.put(wh.class, new bnh(new bhi(), 0.7F));
/*  59 */     this.q.put(wm.class, new bol(new bhi(), 0.7F));
/*  60 */     this.q.put(wv.class, new bpe(new bio(), new bio(), 0.5F));
/*  61 */     this.q.put(wg.class, new bng(new bhh(), 0.3F));
/*  62 */     this.q.put(wn.class, new bom(new bht(), 0.4F));
/*  63 */     this.q.put(yk.class, new bor());
/*  64 */     this.q.put(xz.class, new bni());
/*  65 */     this.q.put(ya.class, new bnm());
/*  66 */     this.q.put(wr.class, new bou());
/*  67 */     this.q.put(yl.class, new bos());
/*  68 */     this.q.put(yp.class, new bpb());
/*  69 */     this.q.put(xx.class, new bnd());
/*  70 */     this.q.put(yq.class, new bpf());
/*  71 */     this.q.put(ym.class, new bot(new bie(16), new bie(0), 0.25F));
/*  72 */     this.q.put(yf.class, new boe());
/*  73 */     this.q.put(yz.class, new bop());
/*  74 */     this.q.put(ye.class, new bnu(new bip(), 0.5F, 6.0F));
/*  75 */     this.q.put(yd.class, new bnt());
/*  76 */     this.q.put(ws.class, new bow(new bih(), 0.7F));
/*  77 */     this.q.put(yv.class, new bpa());
/*  78 */     this.q.put(wt.class, new boz());
/*  79 */     this.q.put(we.class, new bnc());
/*     */     
/*  81 */     this.q.put(xa.class, new bnl());
/*  82 */     this.q.put(wz.class, new bnk());
/*     */     
/*  84 */     this.q.put(xc.class, new bpc());
/*     */     
/*  86 */     this.q.put(sa.class, new bnj());
/*     */     
/*  88 */     this.q.put(tb.class, new bon());
/*  89 */     this.q.put(st.class, new bnx());
/*  90 */     this.q.put(su.class, new bof());
/*  91 */     this.q.put(zc.class, new bnb());
/*  92 */     this.q.put(zj.class, new bod(ade.ay));
/*  93 */     this.q.put(zm.class, new bod(ade.bi));
/*  94 */     this.q.put(zd.class, new bod(ade.bv));
/*  95 */     this.q.put(zl.class, new bod(ade.aK));
/*  96 */     this.q.put(zo.class, new bod(ade.bn, 16384));
/*  97 */     this.q.put(zn.class, new bod(ade.by));
/*  98 */     this.q.put(zf.class, new bod(ade.bP));
/*  99 */     this.q.put(zg.class, new bnr(2.0F));
/* 100 */     this.q.put(zi.class, new bnr(0.5F));
/* 101 */     this.q.put(zp.class, new bpd());
/* 102 */     this.q.put(xk.class, new bny());
/* 103 */     this.q.put(sq.class, new bnp());
/* 104 */     this.q.put(xw.class, new boy());
/* 105 */     this.q.put(xj.class, new bnq());
/*     */     
/* 107 */     this.q.put(xv.class, new box());
/* 108 */     this.q.put(xt.class, new boj());
/* 109 */     this.q.put(xl.class, new boi());
/* 110 */     this.q.put(xi.class, new bne());
/* 111 */     this.q.put(xe.class, new bns());
/*     */     
/* 113 */     this.q.put(wi.class, new bnv(new bhs(), 0.75F));
/*     */     
/* 115 */     this.q.put(xh.class, new bog());
/*     */     
/* 117 */     for (bno localbno : this.q.values()) {
/* 118 */       localbno.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public bno a(Class paramClass)
/*     */   {
/* 124 */     bno localbno = (bno)this.q.get(paramClass);
/* 125 */     if ((localbno == null) && (paramClass != sa.class)) {
/* 126 */       localbno = a(paramClass.getSuperclass());
/* 127 */       this.q.put(paramClass, localbno);
/*     */     }
/* 129 */     return localbno;
/*     */   }
/*     */   
/*     */   public bno a(sa paramsa) {
/* 133 */     return a(paramsa.getClass());
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, bqf parambqf, bbu parambbu, sv paramsv, sa paramsa, bbj parambbj, float paramFloat) {
/* 137 */     this.g = paramahb;
/* 138 */     this.e = parambqf;
/* 139 */     this.l = parambbj;
/* 140 */     this.h = paramsv;
/* 141 */     this.i = paramsa;
/* 142 */     this.r = parambbu;
/*     */     
/* 144 */     if (paramsv.bm()) {
/* 145 */       aji localaji = paramahb.a(qh.c(paramsv.s), qh.c(paramsv.t), qh.c(paramsv.u));
/* 146 */       if (localaji == ajn.C) {
/* 147 */         int i1 = paramahb.e(qh.c(paramsv.s), qh.c(paramsv.t), qh.c(paramsv.u));
/*     */         
/* 149 */         int i2 = i1 & 0x3;
/* 150 */         this.j = (i2 * 90 + 180);
/* 151 */         this.k = 0.0F;
/*     */       }
/*     */     } else {
/* 154 */       this.j = (paramsv.A + (paramsv.y - paramsv.A) * paramFloat);
/* 155 */       this.k = (paramsv.B + (paramsv.z - paramsv.B) * paramFloat);
/*     */     }
/*     */     
/* 158 */     if (parambbj.aw == 2) {
/* 159 */       this.j += 180.0F;
/*     */     }
/*     */     
/* 162 */     this.m = (paramsv.S + (paramsv.s - paramsv.S) * paramFloat);
/* 163 */     this.n = (paramsv.T + (paramsv.t - paramsv.T) * paramFloat);
/* 164 */     this.o = (paramsv.U + (paramsv.u - paramsv.U) * paramFloat);
/*     */   }
/*     */   
/*     */   public boolean a(sa paramsa, float paramFloat) {
/* 168 */     return a(paramsa, paramFloat, false);
/*     */   }
/*     */   
/*     */   public boolean a(sa paramsa, float paramFloat, boolean paramBoolean) {
/* 172 */     if (paramsa.aa == 0) {
/* 173 */       paramsa.S = paramsa.s;
/* 174 */       paramsa.T = paramsa.t;
/* 175 */       paramsa.U = paramsa.u;
/*     */     }
/* 177 */     double d1 = paramsa.S + (paramsa.s - paramsa.S) * paramFloat;
/* 178 */     double d2 = paramsa.T + (paramsa.t - paramsa.T) * paramFloat;
/* 179 */     double d3 = paramsa.U + (paramsa.u - paramsa.U) * paramFloat;
/* 180 */     float f1 = paramsa.A + (paramsa.y - paramsa.A) * paramFloat;
/*     */     
/* 182 */     int i1 = paramsa.c(paramFloat);
/* 183 */     if (paramsa.al()) {
/* 184 */       i1 = 15728880;
/*     */     }
/* 186 */     int i2 = i1 % 65536;
/* 187 */     int i3 = i1 / 65536;
/* 188 */     buu.a(buu.c, i2 / 1.0F, i3 / 1.0F);
/* 189 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 191 */     return a(paramsa, d1 - b, d2 - c, d3 - d, f1, paramFloat, paramBoolean);
/*     */   }
/*     */   
/*     */   public sa i;
/*     */   public float j;
/*     */   
/* 197 */   public boolean a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) { return a(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2, false); }
/*     */   
/*     */   public float k;
/*     */   
/* 201 */   public boolean a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, boolean paramBoolean) { bno localbno = null;
/*     */     try
/*     */     {
/* 204 */       localbno = a(paramsa);
/* 205 */       if ((localbno != null) && (this.e != null)) {
/* 206 */         if ((!localbno.a()) || (paramBoolean)) {
/*     */           try {
/* 208 */             localbno.a(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */           } catch (Throwable localThrowable1) {
/* 210 */             throw new s(b.a(localThrowable1, "Rendering entity in world"));
/*     */           }
/*     */           try
/*     */           {
/* 214 */             localbno.b(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */           } catch (Throwable localThrowable2) {
/* 216 */             throw new s(b.a(localThrowable2, "Post-rendering entity in world"));
/*     */           }
/*     */           
/* 219 */           if ((p) && (!paramsa.ap()) && (!paramBoolean)) {
/*     */             try {
/* 221 */               b(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*     */             } catch (Throwable localThrowable3) {
/* 223 */               throw new s(b.a(localThrowable3, "Rendering entity hitbox in world"));
/*     */             }
/*     */           }
/*     */         }
/* 227 */       } else if (this.e != null) {
/* 228 */         return false;
/*     */       }
/*     */     } catch (Throwable localThrowable4) {
/* 231 */       b localb = b.a(localThrowable4, "Rendering entity in world");
/* 232 */       k localk1 = localb.a("Entity being rendered");
/* 233 */       paramsa.a(localk1);
/*     */       
/* 235 */       k localk2 = localb.a("Renderer details");
/* 236 */       localk2.a("Assigned renderer", localbno);
/* 237 */       localk2.a("Location", k.a(paramDouble1, paramDouble2, paramDouble3));
/* 238 */       localk2.a("Rotation", Float.valueOf(paramFloat1));
/* 239 */       localk2.a("Delta", Float.valueOf(paramFloat2));
/*     */       
/* 241 */       throw new s(localb);
/*     */     }
/* 243 */     return true; }
/*     */   
/*     */   public bbj l;
/*     */   
/* 247 */   private void b(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) { GL11.glDepthMask(false);
/* 248 */     GL11.glDisable(3553);
/* 249 */     GL11.glDisable(2896);
/* 250 */     GL11.glDisable(2884);
/* 251 */     GL11.glDisable(3042);
/*     */     
/* 253 */     float f1 = paramsa.M / 2.0F;
/* 254 */     azt localazt = azt.a(paramDouble1 - f1, paramDouble2, paramDouble3 - f1, paramDouble1 + f1, paramDouble2 + paramsa.N, paramDouble3 + f1);
/* 255 */     bma.a(localazt, 16777215);
/*     */     
/* 257 */     GL11.glEnable(3553);
/* 258 */     GL11.glEnable(2896);
/* 259 */     GL11.glEnable(2884);
/* 260 */     GL11.glDisable(3042);
/* 261 */     GL11.glDepthMask(true); }
/*     */   
/*     */   public double m;
/*     */   
/* 265 */   public void a(ahb paramahb) { this.g = paramahb; }
/*     */   
/*     */   public double n;
/*     */   
/* 269 */   public double a(double paramDouble1, double paramDouble2, double paramDouble3) { double d1 = paramDouble1 - this.m;
/* 270 */     double d2 = paramDouble2 - this.n;
/* 271 */     double d3 = paramDouble3 - this.o;
/* 272 */     return d1 * d1 + d2 * d2 + d3 * d3; }
/*     */   
/*     */   public double o;
/*     */   public static boolean p;
/* 276 */   public bbu a() { return this.r; }
/*     */   
/*     */ 
/*     */   public void a(rg paramrg) {
/* 280 */     for (bno localbno : this.q.values()) {
/* 281 */       localbno.a(paramrg);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */