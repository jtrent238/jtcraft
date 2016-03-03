/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.net.URI;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.Sys;
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
/*     */ public class bgf
/*     */   extends bdw
/*     */ {
/*  27 */   private static final Logger a = ;
/*     */   
/*     */   private bdw f;
/*     */   
/*     */   private List g;
/*     */   
/*     */   private List h;
/*     */   
/*     */   private bgj i;
/*     */   private bgl r;
/*     */   
/*     */   public bgf(bdw parambdw)
/*     */   {
/*  40 */     this.f = parambdw;
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  45 */     this.n.add(new bcj(2, this.l / 2 - 154, this.m - 48, brp.a("resourcePack.openFolder", new Object[0])));
/*  46 */     this.n.add(new bcj(1, this.l / 2 + 4, this.m - 48, brp.a("gui.done", new Object[0])));
/*     */     
/*  48 */     this.g = new ArrayList();
/*  49 */     this.h = new ArrayList();
/*     */     
/*  51 */     brc localbrc = this.k.R();
/*  52 */     localbrc.a();
/*  53 */     ArrayList localArrayList = Lists.newArrayList(localbrc.b());
/*  54 */     localArrayList.removeAll(localbrc.c());
/*  55 */     for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext();) { localbrf = (brf)localIterator.next();
/*  56 */       this.g.add(new bgi(this, localbrf)); }
/*     */     brf localbrf;
/*  58 */     for (localIterator = Lists.reverse(localbrc.c()).iterator(); localIterator.hasNext();) { localbrf = (brf)localIterator.next();
/*  59 */       this.h.add(new bgi(this, localbrf));
/*     */     }
/*     */     
/*  62 */     this.h.add(new bgh(this));
/*     */     
/*  64 */     this.i = new bgj(this.k, 200, this.m, this.g);
/*  65 */     this.i.g(this.l / 2 - 4 - 200);
/*  66 */     this.i.d(7, 8);
/*  67 */     this.r = new bgl(this.k, 200, this.m, this.h);
/*  68 */     this.r.g(this.l / 2 + 4);
/*  69 */     this.r.d(7, 8);
/*     */   }
/*     */   
/*     */   public boolean a(bgg parambgg) {
/*  73 */     return this.h.contains(parambgg);
/*     */   }
/*     */   
/*     */   public List b(bgg parambgg) {
/*  77 */     if (a(parambgg)) {
/*  78 */       return this.h;
/*     */     }
/*  80 */     return this.g;
/*     */   }
/*     */   
/*     */   public List a()
/*     */   {
/*  85 */     return this.g;
/*     */   }
/*     */   
/*     */   public List f() {
/*  89 */     return this.h;
/*     */   }
/*     */   
/*     */   protected void a(bcb parambcb)
/*     */   {
/*  94 */     if (!parambcb.l) return;
/*     */     Object localObject1;
/*  96 */     Object localObject2; if (parambcb.k == 2) {
/*  97 */       localObject1 = this.k.R().d();
/*  98 */       localObject2 = ((File)localObject1).getAbsolutePath();
/*     */       
/* 100 */       if (u.a() == v.d) {
/*     */         try {
/* 102 */           a.info((String)localObject2);
/* 103 */           Runtime.getRuntime().exec(new String[] { "/usr/bin/open", localObject2 });
/*     */           
/*     */ 
/* 106 */           return;
/*     */         } catch (IOException localIOException1) {
/* 108 */           a.error("Couldn't open file", localIOException1);
/*     */         }
/* 110 */       } else if (u.a() == v.c)
/*     */       {
/*     */ 
/* 113 */         String str = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { localObject2 });
/*     */         try {
/* 115 */           Runtime.getRuntime().exec(str);
/* 116 */           return;
/*     */         } catch (IOException localIOException2) {
/* 118 */           a.error("Couldn't open file", localIOException2);
/*     */         }
/*     */       }
/*     */       
/* 122 */       int j = 0;
/*     */       try {
/* 124 */         Class localClass = Class.forName("java.awt.Desktop");
/* 125 */         Object localObject4 = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 126 */         localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject4, new Object[] { ((File)localObject1).toURI() });
/*     */       } catch (Throwable localThrowable) {
/* 128 */         a.error("Couldn't open link", localThrowable);
/* 129 */         j = 1;
/*     */       }
/* 131 */       if (j != 0) {
/* 132 */         a.info("Opening via system class!");
/* 133 */         Sys.openURL("file://" + (String)localObject2);
/*     */       }
/* 135 */     } else if (parambcb.k == 1) {
/* 136 */       localObject1 = Lists.newArrayList();
/* 137 */       for (localObject2 = this.h.iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (bgg)((Iterator)localObject2).next();
/* 138 */         if ((localObject3 instanceof bgi))
/* 139 */           ((List)localObject1).add(((bgi)localObject3).i());
/*     */       }
/*     */       Object localObject3;
/* 142 */       Collections.reverse((List)localObject1);
/* 143 */       this.k.R().a((List)localObject1);
/* 144 */       this.k.u.l.clear();
/*     */       
/* 146 */       for (localObject2 = ((List)localObject1).iterator(); ((Iterator)localObject2).hasNext();) { localObject3 = (brf)((Iterator)localObject2).next();
/* 147 */         this.k.u.l.add(((brf)localObject3).d());
/*     */       }
/*     */       
/* 150 */       this.k.u.b();
/* 151 */       this.k.c();
/* 152 */       this.k.a(this.f);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 158 */     super.a(paramInt1, paramInt2, paramInt3);
/* 159 */     this.i.a(paramInt1, paramInt2, paramInt3);
/* 160 */     this.r.a(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 165 */     super.b(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*     */   {
/* 170 */     c(0);
/*     */     
/* 172 */     this.i.a(paramInt1, paramInt2, paramFloat);
/* 173 */     this.r.a(paramInt1, paramInt2, paramFloat);
/*     */     
/* 175 */     a(this.q, brp.a("resourcePack.title", new Object[0]), this.l / 2, 16, 16777215);
/* 176 */     a(this.q, brp.a("resourcePack.folderInfo", new Object[0]), this.l / 2 - 77, this.m - 26, 8421504);
/*     */     
/* 178 */     super.a(paramInt1, paramInt2, paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */