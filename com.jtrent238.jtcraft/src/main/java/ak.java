/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
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
/*     */ public class ak
/*     */   extends y
/*     */ {
/*  20 */   private static final Logger a = ;
/*     */   private long b;
/*     */   private int c;
/*     */   
/*     */   public String c()
/*     */   {
/*  26 */     return "debug";
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  31 */     return 3;
/*     */   }
/*     */   
/*     */   public String c(ac paramac)
/*     */   {
/*  36 */     return "commands.debug.usage";
/*     */   }
/*     */   
/*     */   public void b(ac paramac, String[] paramArrayOfString)
/*     */   {
/*  41 */     if (paramArrayOfString.length == 1) {
/*  42 */       if (paramArrayOfString[0].equals("start")) {
/*  43 */         a(paramac, this, "commands.debug.start", new Object[0]);
/*     */         
/*  45 */         MinecraftServer.I().am();
/*  46 */         this.b = MinecraftServer.ar();
/*  47 */         this.c = MinecraftServer.I().al();
/*  48 */         return; }
/*  49 */       if (paramArrayOfString[0].equals("stop")) {
/*  50 */         if (!MinecraftServer.I().b.a) {
/*  51 */           throw new cd("commands.debug.notStarted", new Object[0]);
/*     */         }
/*     */         
/*  54 */         long l1 = MinecraftServer.ar();
/*  55 */         int i = MinecraftServer.I().al();
/*     */         
/*  57 */         long l2 = l1 - this.b;
/*  58 */         int j = i - this.c;
/*     */         
/*  60 */         a(l2, j);
/*     */         
/*  62 */         MinecraftServer.I().b.a = false;
/*  63 */         a(paramac, this, "commands.debug.stop", new Object[] { Float.valueOf((float)l2 / 1000.0F), Integer.valueOf(j) });
/*  64 */         return;
/*     */       }
/*     */     }
/*     */     
/*  68 */     throw new ci("commands.debug.usage", new Object[0]);
/*     */   }
/*     */   
/*     */   private void a(long paramLong, int paramInt) {
/*  72 */     File localFile = new File(MinecraftServer.I().d("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
/*     */     
/*  74 */     localFile.getParentFile().mkdirs();
/*     */     try
/*     */     {
/*  77 */       FileWriter localFileWriter = new FileWriter(localFile);
/*  78 */       localFileWriter.write(b(paramLong, paramInt));
/*  79 */       localFileWriter.close();
/*     */     } catch (Throwable localThrowable) {
/*  81 */       a.error("Could not save profiler results to " + localFile, localThrowable);
/*     */     }
/*     */   }
/*     */   
/*     */   private String b(long paramLong, int paramInt) {
/*  86 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/*  88 */     localStringBuilder.append("---- Minecraft Profiler Results ----\n");
/*  89 */     localStringBuilder.append("// ");
/*  90 */     localStringBuilder.append(d());
/*  91 */     localStringBuilder.append("\n\n");
/*     */     
/*  93 */     localStringBuilder.append("Time span: ").append(paramLong).append(" ms\n");
/*  94 */     localStringBuilder.append("Tick span: ").append(paramInt).append(" ticks\n");
/*  95 */     localStringBuilder.append("// This is approximately ").append(String.format("%.2f", new Object[] { Float.valueOf(paramInt / ((float)paramLong / 1000.0F)) })).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
/*     */     
/*     */ 
/*  98 */     localStringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
/*     */     
/* 100 */     a(0, "root", localStringBuilder);
/*     */     
/* 102 */     localStringBuilder.append("--- END PROFILE DUMP ---\n\n");
/*     */     
/* 104 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   private void a(int paramInt, String paramString, StringBuilder paramStringBuilder) {
/* 108 */     List localList = MinecraftServer.I().b.b(paramString);
/* 109 */     if ((localList == null) || (localList.size() < 3)) { return;
/*     */     }
/* 111 */     for (int i = 1; i < localList.size(); i++) {
/* 112 */       qj localqj = (qj)localList.get(i);
/*     */       
/* 114 */       paramStringBuilder.append(String.format("[%02d] ", new Object[] { Integer.valueOf(paramInt) }));
/* 115 */       for (int j = 0; j < paramInt; j++)
/* 116 */         paramStringBuilder.append(" ");
/* 117 */       paramStringBuilder.append(localqj.c);
/* 118 */       paramStringBuilder.append(" - ");
/* 119 */       paramStringBuilder.append(String.format("%.2f", new Object[] { Double.valueOf(localqj.a) }));
/* 120 */       paramStringBuilder.append("%/");
/* 121 */       paramStringBuilder.append(String.format("%.2f", new Object[] { Double.valueOf(localqj.b) }));
/* 122 */       paramStringBuilder.append("%\n");
/*     */       
/* 124 */       if (!localqj.c.equals("unspecified")) {
/*     */         try {
/* 126 */           a(paramInt + 1, paramString + "." + localqj.c, paramStringBuilder);
/*     */         } catch (Exception localException) {
/* 128 */           paramStringBuilder.append("[[ EXCEPTION " + localException + " ]]");
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private static String d()
/*     */   {
/* 136 */     String[] arrayOfString = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 143 */       return arrayOfString[((int)(System.nanoTime() % arrayOfString.length))];
/*     */     } catch (Throwable localThrowable) {}
/* 145 */     return "Witty comment unavailable :(";
/*     */   }
/*     */   
/*     */ 
/*     */   public List a(ac paramac, String[] paramArrayOfString)
/*     */   {
/* 151 */     if (paramArrayOfString.length == 1) { return a(paramArrayOfString, new String[] { "start", "stop" });
/*     */     }
/* 153 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */