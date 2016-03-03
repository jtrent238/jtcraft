/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class mn
/*     */ {
/*  22 */   private static final Logger a = ;
/*     */   private final mt b;
/*  24 */   private Set c = new HashSet();
/*  25 */   private pz d = new pz();
/*     */   private int e;
/*     */   
/*     */   public mn(mt parammt) {
/*  29 */     this.b = parammt;
/*  30 */     this.e = parammt.q().ah().d();
/*     */   }
/*     */   
/*     */   public void a(sa paramsa) { mw localmw;
/*  34 */     if ((paramsa instanceof mw)) {
/*  35 */       a(paramsa, 512, 2);
/*  36 */       localmw = (mw)paramsa;
/*  37 */       for (my localmy : this.c) {
/*  38 */         if (localmy.a != localmw) {
/*  39 */           localmy.b(localmw);
/*     */         }
/*     */       }
/*  42 */     } else if ((paramsa instanceof xe)) { a(paramsa, 64, 5, true);
/*  43 */     } else if ((paramsa instanceof zc)) { a(paramsa, 64, 20, false);
/*  44 */     } else if ((paramsa instanceof zi)) { a(paramsa, 64, 10, false);
/*  45 */     } else if ((paramsa instanceof ze)) { a(paramsa, 64, 10, false);
/*  46 */     } else if ((paramsa instanceof zj)) { a(paramsa, 64, 10, true);
/*  47 */     } else if ((paramsa instanceof zm)) { a(paramsa, 64, 10, true);
/*  48 */     } else if ((paramsa instanceof zd)) { a(paramsa, 64, 4, true);
/*  49 */     } else if ((paramsa instanceof zl)) { a(paramsa, 64, 10, true);
/*  50 */     } else if ((paramsa instanceof zo)) { a(paramsa, 64, 10, true);
/*  51 */     } else if ((paramsa instanceof zn)) { a(paramsa, 64, 10, true);
/*  52 */     } else if ((paramsa instanceof zf)) { a(paramsa, 64, 10, true);
/*  53 */     } else if ((paramsa instanceof xk)) { a(paramsa, 64, 20, true);
/*  54 */     } else if ((paramsa instanceof xl)) { a(paramsa, 80, 3, true);
/*  55 */     } else if ((paramsa instanceof xi)) { a(paramsa, 80, 3, true);
/*  56 */     } else if ((paramsa instanceof ws)) { a(paramsa, 64, 3, true);
/*  57 */     } else if ((paramsa instanceof xc)) { a(paramsa, 80, 3, false);
/*  58 */     } else if ((paramsa instanceof we)) { a(paramsa, 80, 3, false);
/*  59 */     } else if ((paramsa instanceof ry)) { a(paramsa, 80, 3, true);
/*  60 */     } else if ((paramsa instanceof xa)) { a(paramsa, 160, 3, true);
/*  61 */     } else if ((paramsa instanceof xw)) { a(paramsa, 160, 10, true);
/*  62 */     } else if ((paramsa instanceof xj)) { a(paramsa, 160, 20, true);
/*  63 */     } else if ((paramsa instanceof ss)) { a(paramsa, 160, Integer.MAX_VALUE, false);
/*  64 */     } else if ((paramsa instanceof sq)) { a(paramsa, 160, 20, true);
/*  65 */     } else if ((paramsa instanceof wz)) { a(paramsa, 256, Integer.MAX_VALUE, false);
/*     */     }
/*     */   }
/*     */   
/*  69 */   public void a(sa paramsa, int paramInt1, int paramInt2) { a(paramsa, paramInt1, paramInt2, false); }
/*     */   
/*     */   public void a(sa paramsa, int paramInt1, int paramInt2, boolean paramBoolean)
/*     */   {
/*  73 */     if (paramInt1 > this.e) paramInt1 = this.e;
/*     */     try
/*     */     {
/*  76 */       if (this.d.b(paramsa.y())) {
/*  77 */         throw new IllegalStateException("Entity is already tracked!");
/*     */       }
/*  79 */       my localmy = new my(paramsa, paramInt1, paramInt2, paramBoolean);
/*  80 */       this.c.add(localmy);
/*  81 */       this.d.a(paramsa.y(), localmy);
/*  82 */       localmy.b(this.b.h);
/*     */     } catch (Throwable localThrowable) {
/*  84 */       b localb = b.a(localThrowable, "Adding entity to track");
/*  85 */       k localk1 = localb.a("Entity To Track");
/*     */       
/*  87 */       localk1.a("Tracking range", paramInt1 + " blocks");
/*  88 */       localk1.a("Update interval", new mo(this, paramInt2));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  96 */       paramsa.a(localk1);
/*     */       
/*  98 */       k localk2 = localb.a("Entity That Is Already Tracked");
/*  99 */       ((my)this.d.a(paramsa.y())).a.a(localk2);
/*     */       try
/*     */       {
/* 102 */         throw new s(localb);
/*     */       } catch (s locals) {
/* 104 */         a.error("\"Silently\" catching entity tracking error.", locals);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(sa paramsa) {
/* 110 */     if ((paramsa instanceof mw)) {
/* 111 */       localObject = (mw)paramsa;
/* 112 */       for (my localmy : this.c) {
/* 113 */         localmy.a((mw)localObject);
/*     */       }
/*     */     }
/* 116 */     Object localObject = (my)this.d.d(paramsa.y());
/* 117 */     if (localObject != null) {
/* 118 */       this.c.remove(localObject);
/* 119 */       ((my)localObject).a();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/* 124 */     ArrayList localArrayList = new ArrayList();
/* 125 */     for (Iterator localIterator1 = this.c.iterator(); localIterator1.hasNext();) { localObject = (my)localIterator1.next();
/* 126 */       ((my)localObject).a(this.b.h);
/* 127 */       if ((((my)localObject).n) && ((((my)localObject).a instanceof mw))) {
/* 128 */         localArrayList.add((mw)((my)localObject).a);
/*     */       }
/*     */     }
/*     */     Object localObject;
/* 132 */     for (int i = 0; i < localArrayList.size(); i++) {
/* 133 */       localObject = (mw)localArrayList.get(i);
/* 134 */       for (my localmy : this.c) {
/* 135 */         if (localmy.a != localObject) {
/* 136 */           localmy.b((mw)localObject);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, ft paramft) {
/* 143 */     my localmy = (my)this.d.a(paramsa.y());
/* 144 */     if (localmy != null) {
/* 145 */       localmy.a(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(sa paramsa, ft paramft) {
/* 150 */     my localmy = (my)this.d.a(paramsa.y());
/* 151 */     if (localmy != null) {
/* 152 */       localmy.b(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(mw parammw) {
/* 157 */     for (my localmy : this.c) {
/* 158 */       localmy.c(parammw);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(mw parammw, apx paramapx) {
/* 163 */     for (my localmy : this.c) {
/* 164 */       if ((localmy.a != parammw) && (localmy.a.ah == paramapx.g) && (localmy.a.aj == paramapx.h)) {
/* 165 */         localmy.b(parammw);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */