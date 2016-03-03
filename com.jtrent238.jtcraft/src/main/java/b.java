/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ public class b
/*     */ {
/*  18 */   private static final Logger a = ;
/*     */   private final String b;
/*     */   private final Throwable c;
/*  21 */   private final k d = new k(this, "System Details");
/*  22 */   private final List e = new ArrayList();
/*     */   private File f;
/*  24 */   private boolean g = true;
/*  25 */   private StackTraceElement[] h = new StackTraceElement[0];
/*     */   
/*     */   public b(String paramString, Throwable paramThrowable) {
/*  28 */     this.b = paramString;
/*  29 */     this.c = paramThrowable;
/*     */     
/*  31 */     h();
/*     */   }
/*     */   
/*     */   private void h() {
/*  35 */     this.d.a("Minecraft Version", new c(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  42 */     this.d.a("Operating System", new d(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  49 */     this.d.a("Java Version", new e(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  56 */     this.d.a("Java VM Version", new f(this));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  63 */     this.d.a("Memory", new g(this));
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
/*  78 */     this.d.a("JVM Flags", new h(this));
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
/* 100 */     this.d.a("AABB Pool Size", new i(this));
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
/* 114 */     this.d.a("IntCache", new j(this));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String a()
/*     */   {
/* 123 */     return this.b;
/*     */   }
/*     */   
/*     */   public Throwable b() {
/* 127 */     return this.c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(StringBuilder paramStringBuilder)
/*     */   {
/* 139 */     if (((this.h == null) || (this.h.length <= 0)) && (this.e.size() > 0)) {
/* 140 */       this.h = ((StackTraceElement[])ArrayUtils.subarray(((k)this.e.get(0)).a(), 0, 1));
/*     */     }
/*     */     
/* 143 */     if ((this.h != null) && (this.h.length > 0)) {
/* 144 */       paramStringBuilder.append("-- Head --\n");
/* 145 */       paramStringBuilder.append("Stacktrace:\n");
/*     */       
/* 147 */       for (Object localObject2 : this.h) {
/* 148 */         paramStringBuilder.append("\t").append("at ").append(((StackTraceElement)localObject2).toString());
/* 149 */         paramStringBuilder.append("\n");
/*     */       }
/*     */       
/* 152 */       paramStringBuilder.append("\n");
/*     */     }
/*     */     
/* 155 */     for (??? = this.e.iterator(); ((Iterator)???).hasNext();) { k localk = (k)((Iterator)???).next();
/* 156 */       localk.a(paramStringBuilder);
/* 157 */       paramStringBuilder.append("\n\n");
/*     */     }
/*     */     
/* 160 */     this.d.a(paramStringBuilder);
/*     */   }
/*     */   
/*     */   public String d() {
/* 164 */     StringWriter localStringWriter = null;
/* 165 */     PrintWriter localPrintWriter = null;
/* 166 */     Object localObject1 = this.c;
/*     */     
/* 168 */     if (((Throwable)localObject1).getMessage() == null)
/*     */     {
/* 170 */       if ((localObject1 instanceof NullPointerException)) {
/* 171 */         localObject1 = new NullPointerException(this.b);
/* 172 */       } else if ((localObject1 instanceof StackOverflowError)) {
/* 173 */         localObject1 = new StackOverflowError(this.b);
/* 174 */       } else if ((localObject1 instanceof OutOfMemoryError)) {
/* 175 */         localObject1 = new OutOfMemoryError(this.b);
/*     */       }
/*     */       
/* 178 */       ((Throwable)localObject1).setStackTrace(this.c.getStackTrace());
/*     */     }
/*     */     
/* 181 */     String str = ((Throwable)localObject1).toString();
/*     */     try
/*     */     {
/* 184 */       localStringWriter = new StringWriter();
/* 185 */       localPrintWriter = new PrintWriter(localStringWriter);
/* 186 */       ((Throwable)localObject1).printStackTrace(localPrintWriter);
/* 187 */       str = localStringWriter.toString();
/*     */     } finally {
/* 189 */       IOUtils.closeQuietly(localStringWriter);
/* 190 */       IOUtils.closeQuietly(localPrintWriter);
/*     */     }
/*     */     
/* 193 */     return str;
/*     */   }
/*     */   
/*     */   public String e() {
/* 197 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 199 */     localStringBuilder.append("---- Minecraft Crash Report ----\n");
/* 200 */     localStringBuilder.append("// ");
/* 201 */     localStringBuilder.append(i());
/* 202 */     localStringBuilder.append("\n\n");
/*     */     
/* 204 */     localStringBuilder.append("Time: ");
/* 205 */     localStringBuilder.append(new SimpleDateFormat().format(new Date()));
/* 206 */     localStringBuilder.append("\n");
/*     */     
/* 208 */     localStringBuilder.append("Description: ");
/* 209 */     localStringBuilder.append(this.b);
/* 210 */     localStringBuilder.append("\n\n");
/*     */     
/* 212 */     localStringBuilder.append(d());
/* 213 */     localStringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
/*     */     
/* 215 */     for (int i = 0; i < 87; i++) {
/* 216 */       localStringBuilder.append("-");
/*     */     }
/* 218 */     localStringBuilder.append("\n\n");
/* 219 */     a(localStringBuilder);
/*     */     
/* 221 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   public File f() {
/* 225 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean a(File paramFile) {
/* 229 */     if (this.f != null) return false;
/* 230 */     if (paramFile.getParentFile() != null) paramFile.getParentFile().mkdirs();
/*     */     try
/*     */     {
/* 233 */       FileWriter localFileWriter = new FileWriter(paramFile);
/* 234 */       localFileWriter.write(e());
/* 235 */       localFileWriter.close();
/*     */       
/* 237 */       this.f = paramFile;
/* 238 */       return true;
/*     */     } catch (Throwable localThrowable) {
/* 240 */       a.error("Could not save crash report to " + paramFile, localThrowable); }
/* 241 */     return false;
/*     */   }
/*     */   
/*     */   public k g()
/*     */   {
/* 246 */     return this.d;
/*     */   }
/*     */   
/*     */   public k a(String paramString) {
/* 250 */     return a(paramString, 1);
/*     */   }
/*     */   
/*     */   public k a(String paramString, int paramInt) {
/* 254 */     k localk1 = new k(this, paramString);
/*     */     
/* 256 */     if (this.g) {
/* 257 */       int i = localk1.a(paramInt);
/* 258 */       StackTraceElement[] arrayOfStackTraceElement = this.c.getStackTrace();
/* 259 */       StackTraceElement localStackTraceElement1 = null;
/* 260 */       StackTraceElement localStackTraceElement2 = null;
/*     */       
/* 262 */       int j = arrayOfStackTraceElement.length - i;
/* 263 */       if (j < 0) {
/* 264 */         System.out.println("Negative index in crash report handler (" + arrayOfStackTraceElement.length + "/" + i + ")");
/*     */       }
/*     */       
/* 267 */       if ((arrayOfStackTraceElement != null) && (0 <= j) && (j < arrayOfStackTraceElement.length)) {
/* 268 */         localStackTraceElement1 = arrayOfStackTraceElement[j];
/*     */         
/* 270 */         if (arrayOfStackTraceElement.length + 1 - i < arrayOfStackTraceElement.length) {
/* 271 */           localStackTraceElement2 = arrayOfStackTraceElement[(arrayOfStackTraceElement.length + 1 - i)];
/*     */         }
/*     */       }
/*     */       
/* 275 */       this.g = localk1.a(localStackTraceElement1, localStackTraceElement2);
/*     */       
/* 277 */       if ((i > 0) && (!this.e.isEmpty())) {
/* 278 */         k localk2 = (k)this.e.get(this.e.size() - 1);
/* 279 */         localk2.b(i);
/* 280 */       } else if ((arrayOfStackTraceElement != null) && (arrayOfStackTraceElement.length >= i) && (0 <= j) && (j < arrayOfStackTraceElement.length)) {
/* 281 */         this.h = new StackTraceElement[j];
/* 282 */         System.arraycopy(arrayOfStackTraceElement, 0, this.h, 0, this.h.length);
/*     */       } else {
/* 284 */         this.g = false;
/*     */       }
/*     */     }
/*     */     
/* 288 */     this.e.add(localk1);
/* 289 */     return localk1;
/*     */   }
/*     */   
/*     */   private static String i()
/*     */   {
/* 294 */     String[] arrayOfString = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
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
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 332 */       return arrayOfString[((int)(System.nanoTime() % arrayOfString.length))];
/*     */     } catch (Throwable localThrowable) {}
/* 334 */     return "Witty comment unavailable :(";
/*     */   }
/*     */   
/*     */ 
/*     */   public static b a(Throwable paramThrowable, String paramString)
/*     */   {
/*     */     b localb;
/* 341 */     if ((paramThrowable instanceof s)) {
/* 342 */       localb = ((s)paramThrowable).a();
/*     */     } else {
/* 344 */       localb = new b(paramString, paramThrowable);
/*     */     }
/*     */     
/* 347 */     return localb;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */