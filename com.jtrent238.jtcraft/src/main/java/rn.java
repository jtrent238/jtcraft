/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class rn
/*     */ {
/*  19 */   private final List a = new ArrayList();
/*     */   private final sv b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private String h;
/*     */   
/*     */   public rn(sv paramsv) {
/*  29 */     this.b = paramsv;
/*     */   }
/*     */   
/*     */   public void a() {
/*  33 */     j();
/*     */     
/*  35 */     if (this.b.h_()) {
/*  36 */       aji localaji = this.b.o.a(qh.c(this.b.s), qh.c(this.b.C.b), qh.c(this.b.u));
/*     */       
/*  38 */       if (localaji == ajn.ap) {
/*  39 */         this.h = "ladder";
/*  40 */       } else if (localaji == ajn.bd) {
/*  41 */         this.h = "vines";
/*     */       }
/*  43 */     } else if (this.b.M()) {
/*  44 */       this.h = "water";
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ro paramro, float paramFloat1, float paramFloat2) {
/*  49 */     g();
/*  50 */     a();
/*     */     
/*  52 */     rm localrm = new rm(paramro, this.b.aa, paramFloat1, paramFloat2, this.h, this.b.R);
/*     */     
/*  54 */     this.a.add(localrm);
/*  55 */     this.c = this.b.aa;
/*  56 */     this.g = true;
/*     */     
/*  58 */     if ((localrm.f()) && (!this.f) && (this.b.Z())) {
/*  59 */       this.f = true;
/*  60 */       this.d = this.b.aa;
/*  61 */       this.e = this.d;
/*  62 */       this.b.bu();
/*     */     }
/*     */   }
/*     */   
/*     */   public fj b() {
/*  67 */     if (this.a.size() == 0) { return new fr("death.attack.generic", new Object[] { this.b.c_() });
/*     */     }
/*  69 */     rm localrm1 = i();
/*  70 */     rm localrm2 = (rm)this.a.get(this.a.size() - 1);
/*     */     
/*  72 */     fj localfj1 = localrm2.h();
/*  73 */     sa localsa1 = localrm2.a().j();
/*     */     Object localObject1;
/*  75 */     if ((localrm1 != null) && (localrm2.a() == ro.h)) {
/*  76 */       fj localfj2 = localrm1.h();
/*     */       
/*  78 */       if ((localrm1.a() == ro.h) || (localrm1.a() == ro.i)) {
/*  79 */         localObject1 = new fr("death.fell.accident." + a(localrm1), new Object[] { this.b.c_() }); } else { sa localsa2;
/*  80 */         if ((localfj2 != null) && ((localfj1 == null) || (!localfj2.equals(localfj1)))) {
/*  81 */           localsa2 = localrm1.a().j();
/*  82 */           Object localObject2 = (localsa2 instanceof sv) ? ((sv)localsa2).be() : null;
/*     */           
/*  84 */           if ((localObject2 != null) && (((add)localObject2).u())) {
/*  85 */             localObject1 = new fr("death.fell.assist.item", new Object[] { this.b.c_(), localfj2, ((add)localObject2).E() });
/*     */           } else {
/*  87 */             localObject1 = new fr("death.fell.assist", new Object[] { this.b.c_(), localfj2 });
/*     */           }
/*  89 */         } else if (localfj1 != null) {
/*  90 */           localsa2 = (localsa1 instanceof sv) ? ((sv)localsa1).be() : null;
/*  91 */           if ((localsa2 != null) && (localsa2.u())) {
/*  92 */             localObject1 = new fr("death.fell.finish.item", new Object[] { this.b.c_(), localfj1, localsa2.E() });
/*     */           } else {
/*  94 */             localObject1 = new fr("death.fell.finish", new Object[] { this.b.c_(), localfj1 });
/*     */           }
/*     */         } else {
/*  97 */           localObject1 = new fr("death.fell.killer", new Object[] { this.b.c_() });
/*     */         }
/*     */       }
/* 100 */     } else { localObject1 = localrm2.a().b(this.b);
/*     */     }
/*     */     
/* 103 */     return (fj)localObject1;
/*     */   }
/*     */   
/*     */   public sv c() {
/* 107 */     sv localsv = null;
/* 108 */     yz localyz = null;
/* 109 */     float f1 = 0.0F;
/* 110 */     float f2 = 0.0F;
/*     */     
/* 112 */     for (rm localrm : this.a) {
/* 113 */       if (((localrm.a().j() instanceof yz)) && ((localyz == null) || (localrm.c() > f2))) {
/* 114 */         f2 = localrm.c();
/* 115 */         localyz = (yz)localrm.a().j();
/*     */       }
/*     */       
/* 118 */       if (((localrm.a().j() instanceof sv)) && ((localsv == null) || (localrm.c() > f1))) {
/* 119 */         f1 = localrm.c();
/* 120 */         localsv = (sv)localrm.a().j();
/*     */       }
/*     */     }
/*     */     
/* 124 */     if ((localyz != null) && (f2 >= f1 / 3.0F)) {
/* 125 */       return localyz;
/*     */     }
/* 127 */     return localsv;
/*     */   }
/*     */   
/*     */   private rm i()
/*     */   {
/* 132 */     Object localObject1 = null;
/* 133 */     Object localObject2 = null;
/* 134 */     int i = 0;
/* 135 */     float f1 = 0.0F;
/*     */     
/* 137 */     for (int j = 0; j < this.a.size(); j++) {
/* 138 */       rm localrm = (rm)this.a.get(j);
/* 139 */       Object localObject3 = j > 0 ? (rm)this.a.get(j - 1) : null;
/*     */       
/* 141 */       if (((localrm.a() == ro.h) || (localrm.a() == ro.i)) && (localrm.i() > 0.0F) && ((localObject1 == null) || (localrm.i() > f1))) {
/* 142 */         if (j > 0) {
/* 143 */           localObject1 = localObject3;
/*     */         } else {
/* 145 */           localObject1 = localrm;
/*     */         }
/* 147 */         f1 = localrm.i();
/*     */       }
/*     */       
/* 150 */       if ((localrm.g() != null) && ((localObject2 == null) || (localrm.c() > i))) {
/* 151 */         localObject2 = localrm;
/*     */       }
/*     */     }
/*     */     
/* 155 */     if ((f1 > 5.0F) && (localObject1 != null))
/* 156 */       return (rm)localObject1;
/* 157 */     if ((i > 5) && (localObject2 != null)) {
/* 158 */       return (rm)localObject2;
/*     */     }
/* 160 */     return null;
/*     */   }
/*     */   
/*     */   private String a(rm paramrm)
/*     */   {
/* 165 */     return paramrm.g() == null ? "generic" : paramrm.g();
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
/*     */   private void j()
/*     */   {
/* 188 */     this.h = null;
/*     */   }
/*     */   
/*     */   public void g() {
/* 192 */     int i = this.f ? 300 : 100;
/*     */     
/* 194 */     if ((this.g) && ((!this.b.Z()) || (this.b.aa - this.c > i))) {
/* 195 */       boolean bool = this.f;
/* 196 */       this.g = false;
/* 197 */       this.f = false;
/* 198 */       this.e = this.b.aa;
/*     */       
/* 200 */       if (bool) {
/* 201 */         this.b.bv();
/*     */       }
/* 203 */       this.a.clear();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */