/*     */ import java.util.Calendar;
/*     */ import java.util.Random;
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
/*     */ public class we
/*     */   extends wd
/*     */ {
/*     */   private r h;
/*     */   
/*     */   public we(ahb paramahb)
/*     */   {
/*  24 */     super(paramahb);
/*     */     
/*  26 */     a(0.5F, 0.9F);
/*  27 */     a(true);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  32 */     super.c();
/*     */     
/*  34 */     this.af.a(16, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/*  39 */     return 0.1F;
/*     */   }
/*     */   
/*     */   protected float bg()
/*     */   {
/*  44 */     return super.bg() * 0.95F;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  49 */     if ((bP()) && (this.Z.nextInt(4) != 0)) {
/*  50 */       return null;
/*     */     }
/*  52 */     return "mob.bat.idle";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  57 */     return "mob.bat.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  62 */     return "mob.bat.death";
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean S()
/*     */   {
/*  68 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void o(sa paramsa) {}
/*     */   
/*     */ 
/*     */ 
/*     */   protected void bo() {}
/*     */   
/*     */ 
/*     */ 
/*     */   protected void aD()
/*     */   {
/*  83 */     super.aD();
/*     */     
/*  85 */     a(yj.a).a(6.0D);
/*     */   }
/*     */   
/*     */   public boolean bP() {
/*  89 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/*  93 */     int i = this.af.a(16);
/*  94 */     if (paramBoolean) {
/*  95 */       this.af.b(16, Byte.valueOf((byte)(i | 0x1)));
/*     */     } else {
/*  97 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean bk()
/*     */   {
/* 103 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public void h()
/*     */   {
/* 109 */     super.h();
/*     */     
/* 111 */     if (bP()) {
/* 112 */       this.v = (this.w = this.x = 0.0D);
/* 113 */       this.t = (qh.c(this.t) + 1.0D - this.N);
/*     */     } else {
/* 115 */       this.w *= 0.6000000238418579D;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void bn()
/*     */   {
/* 122 */     super.bn();
/*     */     
/* 124 */     if (bP()) {
/* 125 */       if (!this.o.a(qh.c(this.s), (int)this.t + 1, qh.c(this.u)).r()) {
/* 126 */         a(false);
/* 127 */         this.o.a(null, 1015, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */       }
/*     */       else {
/* 130 */         if (this.Z.nextInt(200) == 0) {
/* 131 */           this.aO = this.Z.nextInt(360);
/*     */         }
/*     */         
/* 134 */         if (this.o.a(this, 4.0D) != null) {
/* 135 */           a(false);
/* 136 */           this.o.a(null, 1015, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */         }
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/* 142 */       if ((this.h != null) && ((!this.o.c(this.h.a, this.h.b, this.h.c)) || (this.h.b < 1))) {
/* 143 */         this.h = null;
/*     */       }
/* 145 */       if ((this.h == null) || (this.Z.nextInt(30) == 0) || (this.h.e((int)this.s, (int)this.t, (int)this.u) < 4.0F)) {
/* 146 */         this.h = new r((int)this.s + this.Z.nextInt(7) - this.Z.nextInt(7), (int)this.t + this.Z.nextInt(6) - 2, (int)this.u + this.Z.nextInt(7) - this.Z.nextInt(7));
/*     */       }
/*     */       
/* 149 */       double d1 = this.h.a + 0.5D - this.s;
/* 150 */       double d2 = this.h.b + 0.1D - this.t;
/* 151 */       double d3 = this.h.c + 0.5D - this.u;
/*     */       
/* 153 */       this.v += (Math.signum(d1) * 0.5D - this.v) * 0.10000000149011612D;
/* 154 */       this.w += (Math.signum(d2) * 0.699999988079071D - this.w) * 0.10000000149011612D;
/* 155 */       this.x += (Math.signum(d3) * 0.5D - this.x) * 0.10000000149011612D;
/*     */       
/* 157 */       float f1 = (float)(Math.atan2(this.x, this.v) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 158 */       float f2 = qh.g(f1 - this.y);
/* 159 */       this.be = 0.5F;
/* 160 */       this.y += f2;
/*     */       
/* 162 */       if ((this.Z.nextInt(100) == 0) && (this.o.a(qh.c(this.s), (int)this.t + 1, qh.c(this.u)).r())) {
/* 163 */         a(true);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean g_()
/*     */   {
/* 171 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */ 
/*     */   protected void a(double paramDouble, boolean paramBoolean) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean az()
/*     */   {
/* 186 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 192 */     if (aw()) return false;
/* 193 */     if ((!this.o.E) && 
/* 194 */       (bP())) {
/* 195 */       a(false);
/*     */     }
/*     */     
/*     */ 
/* 199 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 204 */     super.a(paramdh);
/*     */     
/* 206 */     this.af.b(16, Byte.valueOf(paramdh.d("BatFlags")));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 211 */     super.b(paramdh);
/*     */     
/* 213 */     paramdh.a("BatFlags", this.af.a(16));
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean by()
/*     */   {
/* 219 */     int i = qh.c(this.C.b);
/* 220 */     if (i >= 63) { return false;
/*     */     }
/* 222 */     int j = qh.c(this.s);
/* 223 */     int k = qh.c(this.u);
/*     */     
/* 225 */     int m = this.o.k(j, i, k);
/* 226 */     int n = 4;
/* 227 */     Calendar localCalendar = this.o.V();
/*     */     
/* 229 */     if (((localCalendar.get(2) + 1 == 10) && (localCalendar.get(5) >= 20)) || ((localCalendar.get(2) + 1 == 11) && (localCalendar.get(5) <= 3))) {
/* 230 */       n = 7;
/* 231 */     } else if (this.Z.nextBoolean()) {
/* 232 */       return false;
/*     */     }
/*     */     
/* 235 */     if (m > this.Z.nextInt(n)) { return false;
/*     */     }
/* 237 */     return super.by();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */